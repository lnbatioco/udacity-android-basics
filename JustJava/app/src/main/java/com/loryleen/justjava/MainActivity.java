package com.loryleen.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Declare global variables to be referenced by other methods
     */
    int quantity = 0;
    int pricePerCoffee = 5;


    /**
     * This method increments the quantity when "+" button is clicked.
     */
    public void increment(View view){
        quantity++;
        display(quantity);
        displayPrice(quantity * pricePerCoffee);
    }

    /**
     * This method decrements the quantity when "-" button is clicked.
     */
    public void decrement(View view){
        if (quantity == 0){
            Toast.makeText(this, "ERROR: Cannot make an order less than 0", Toast.LENGTH_SHORT).show();
        } else {
            quantity--;
            display(quantity);
            displayPrice(quantity * pricePerCoffee);
        }
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        if (quantity > 0){
            display(quantity);
            displayPrice(quantity * pricePerCoffee);
            displayOrderReview();
        } else {
            Toast.makeText(this, "ERROR: Cannot make an order less than 0", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    /**
     * This method displays the order made.
     */
    private void displayOrderReview() {
        String thankYouMessage = "Thank you for ordering.";
        String singleCoffeeMessage = quantity + " java coffee on the way!";
        String multipleCoffeeMessage = quantity + " java coffees on the way!";

        TextView thankYou = (TextView) findViewById(R.id.thankYouOrder_text_view);
        TextView orderReview = (TextView) findViewById(R.id.orderReview_text_view);

        if (quantity == 1){
            thankYou.setText(thankYouMessage);
            orderReview.setText(singleCoffeeMessage);
        } else if (quantity > 1) {
            thankYou.setText(thankYouMessage);
            orderReview.setText(multipleCoffeeMessage);
        }
    }

}