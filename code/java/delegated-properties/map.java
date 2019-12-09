final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
final MyPojo pojo = mapper.convertValue(map, MyPojo.class);

// https://stackoverflow.com/a/16430704/2441104