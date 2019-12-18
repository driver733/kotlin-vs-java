final var act = this;
final var layout = new LinearLayout(act);
layout.setOrientation(LinearLayout.VERTICAL);
final var name = new EditText(act);
final var button = new Button(act);
button.setText("Say Hello");
button.setOnClickListener(
    () -> {
        Toast.makeText(act, "Hello, " + name.text + "!", Toast.LENGTH_SHORT)
           .show()
}
layout.addView(name);
layout.addView(button);