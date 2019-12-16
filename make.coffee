#!/usr/bin/env coffee
project = 'from-java-to-kotlin'

require 'shelljs/make'
path = require 'path'
mission = require 'mission'
listFiles = require 'list-files'
combineFiles = require 'combine-files'

check = (file) -> file != './cirru/header.cirru' && file != './cirru/footer.cirru'
checkGen = (file) -> file.includes('/generated')
checkNotGen = (file) -> !checkGen(file)

mission.time()

cirru = (file, data) ->
  mission.cirruHtml
    files: [file]
    from: 'cirru/generated'
    to: './'
    extname: '.html'
    data: data

target.dev = ->
  listFiles(
     (files) ->
       for file in files.filter(check).filter(checkNotGen)
         combineFiles(['cirru/header.cirru', file, 'cirru/footer.cirru'], 'cirru/generated/' + file.substring(8))
     ,
     {
       name: 'cirru',
       exclude: 'node_modules'
     }
  )
  listFiles(
     (files) ->
       for file in files.filter(check).filter(checkGen)
        cirru(file.substring(18),{inDev: yes, "#{file.substring(18, file.indexOf('.', 10)).replace("-", "_")}": yes})
     ,
     {
       name: 'cirru',
       exclude: 'node_modules'
     }
  )

target.watch = ->
  station = mission.reload()

  mission.watch
    files: ['cirru/', 'code/']
    trigger: (filepath, extname) ->
      cirru inDev: yes
      station.reload project

target.patch = ->
  mission.bump
    file: 'package.json'
    options:
      at: 'patch'
