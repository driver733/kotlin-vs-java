final List&ltUser&gt users = getUsers();
users.sort(Comparator.comparing(user -> user.lastname));
