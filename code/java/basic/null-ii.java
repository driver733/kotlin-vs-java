Integer length =
    bob != null
        && bob.department != null
        && bob.department.text != null
    ? bob.department.text.length()
    : null;
