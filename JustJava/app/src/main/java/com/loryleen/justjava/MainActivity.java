package com.loryleen.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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
        displayPrice(calculatePrice());
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
            displayPrice(calculatePrice());
        }
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        if (quantity > 0){
            display(quantity);
            displayThankYouMessageInsteadOfPrice();
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

    private int calculatePrice(){
        int price = quantity * pricePerCoffee;
        return price;
    }
    private void displayPrice(int price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    private void displayThankYouMessageInsteadOfPrice(){
        String thankYouMessage = "Thank you for ordering!";

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(thankYouMessage);
    }

    /**
     * This method displays the order made.
     */
    private void displayOrderReview() {
        EditText nameField = (EditText) findViewById(R.id.nameField_text_view);
        String name = nameField.getText().toString();

        TextView reviewOrderDetails = (TextView) findViewById(R.id.reviewOrderDetails_text_view);
        TextView reviewName = (TextView) findViewById(R.id.reviewName_text_view);
        TextView reviewQuantity = (TextView) findViewById(R.id.reviewQuantity_text_view);
        TextView reviewTotal = (TextView) findViewById(R.id.reviewTotal_text_view);

        reviewOrderDetails.setText("Here are your order details:");
        reviewName.setText("Name: " + name);
        reviewQuantity.setText("Quantity: " + quantity);
        reviewTotal.setText("Price: $" + calculatePrice());
    }

}