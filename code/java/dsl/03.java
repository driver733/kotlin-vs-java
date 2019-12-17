val act = this;
val layout = new LinearLayout(act);
layout.setOrientation(LinearLayout.VERTICAL);
val name = new EditText(act);
val button = new Button(act);
button.setText("Say Hello");
button.setOnClickListener(
    () -> {
        Toast.makeText(act, "Hello, " + name.text + "!", Toast.LENGTH_SHORT)
           .show()
}
layout.addView(name);
layout.addView(button);