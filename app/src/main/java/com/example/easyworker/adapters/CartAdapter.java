package com.example.easyworker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easyworker.R;
import com.example.easyworker.models.CartModel;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    // creating variables for our ArrayList and context
    private ArrayList<CartModel> cartArrayList;
    private Context context;

    // creating constructor for our adapter class
    public CartAdapter(ArrayList<CartModel> cartArrayList, Context context) {
        this.cartArrayList = cartArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_cart, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        // setting data to our text views from our modal class.
        CartModel cart = cartArrayList.get(position);
        holder.serviceName.setText(cart.getService_name());
        holder.price.setText(String.valueOf(cart.getPrice()));
        holder.time.setText(cart.getTime());
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list.
        return cartArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our text views.
        private final TextView serviceName;
        private final TextView price;
        private final TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views.
            serviceName = itemView.findViewById(R.id.serviceName);
            price = itemView.findViewById(R.id.price);
            time = itemView.findViewById(R.id.time);

        }
    }
}
