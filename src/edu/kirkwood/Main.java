package edu.kirkwood;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


// I think there were instructions missing when I cloned this code. Please let me know what was missing.

public class Main {

    public static void main(String[] args) {
        Widget[] widgets = new Widget[20];

        for(int i = 0; i < widgets.length - 1; i++){
            widgets[i] = new Widget();
        }

        // STEP 1: Create a Supplier object called "widgetCreator" using a method reference.

        Supplier<Widget> widgetCreator = Widget::new;

        // STEP 2: Using the "widgetCreator", instantiate a new Widget object called "widget".
        Widget widget = widgetCreator.get();

        // STEP 3: Create a Predicate called "zeroOrGreater" to test if a Widget's value is greater than or equal to 0.
        // This will take a single Widget as input, use the .getValue() method, and return a boolean.
        // This code should be written on a single line.
        Predicate<Widget> zeroOrGreater = w -> w.getValue() >= 0;

        // STEP 4: Write an if statement that uses the Predicate's abstract method as the condition.
        if (zeroOrGreater.test(widget)) {
            System.out.println("is greater or equal to zero");
        } else {
            System.out.println("is not greater or equal to zero");
        }


        // STEP 5: Create a UnaryOperator called "nameToLower" to convert the Widget name to all lowercase letters.
        // This will take a single Widget as input, use both the .getName() and .setName() methods, and return the updated Widget.
       // not sure how to make this work on one line UnaryOperator<Widget> nameToLower = w -> w.setName(w.getName().toLowerCase());
        //nameToLower.apply(widget);

        // STEP 6: If true, use the UnaryOperator's abstract method to change the widget's name to lowercase.

        // STEP 7: add the widget to the array
        widgets[widgets.length - 1] = widget;
        // STEP 8: Create a Consumer called "print" to print each Widget as a string on a new line using the .toString() method.
        // This code should be written on a single line.
        Consumer<Widget> print = w -> System.out.println(w.toString());

        for (Widget w : widgets) {
            // STEP 9: Use the Consumer's abstract method to print each widget.
            print.accept(w);

        }
    }
}

