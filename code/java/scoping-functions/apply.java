public MyFragment createInstance(Bundle args) {
    final var fragment = new MyFragment();
    fragment.setArguments(args);
    return fragment;
}
