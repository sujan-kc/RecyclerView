package com.example.myrecyclerview.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview.MyModel.Model;
import com.example.myrecyclerview.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {
   private Context context;
   private ArrayList<Model> arrayList;

    public Adapter(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    //Creates Recycleview
    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.singlerow,parent,false);
        return  new AdapterViewHolder(view);
    }

    //adds data to recyclerview
    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {



        holder.textViewname.setText(arrayList.get(position).getName());
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textViewnumber.setText(String.valueOf(arrayList.get(position).getNumber()));

    }
    //gets size of data
    @Override
    public int getItemCount() {
        return arrayList.size();
    }





    //initializes UI of cardview
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private CircleImageView imageView;
        private TextView textViewname,textViewnumber;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardview);
            imageView=itemView.findViewById(R.id.img);
            textViewname=itemView.findViewById(R.id.tv1);
            textViewnumber=itemView.findViewById(R.id.tv2);
        }
    }
}
