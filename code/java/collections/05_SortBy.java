final var users = getUsers();
users.sort(Comparator.comparing(user -> user.lastname));
