package com.example.firebasedatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends FirebaseRecyclerAdapter<Model, MyAdapter.MyViewholder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MyAdapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewholder holder, int position, @NonNull Model model) {
        holder.name.setText(model.getName());
        holder.age.setText(model.getAge());
        holder.adress.setText(model.getAdress());
        Glide.with(holder.img.getContext()).load(model.getImg()).into(holder.img);
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleitem, parent, false);
        return new MyViewholder(view);
    }

    class MyViewholder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView name, age, adress;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            name = itemView.findViewById(R.id.nameText);
            age = itemView.findViewById(R.id.ageText);
            adress = itemView.findViewById(R.id.adressText);
        }
    }

}
