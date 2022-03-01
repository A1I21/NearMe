package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resycleview1.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import models.FaqPlaceObj;
import models.Result;

public class recviewadapter extends RecyclerView.Adapter<recviewadapter.ViewHolder> {
    private static final String TAG = "recviewadapter";
    private List<FaqPlaceObj>mniceplace=new ArrayList<>();

    onClickInterface onClickInterface;

    public recviewadapter( Context mcontext,adapter.onClickInterface onClickInterface) {
        this.onClickInterface = onClickInterface;
        this.mcontext = mcontext;
    }

    private Context mcontext;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Set the name of the 'NicePlace'
        ((ViewHolder)holder).imagename.setText(mniceplace.get(position).getTitle());
        ((ViewHolder)holder).nig.setText(mniceplace.get(position).getNigh());

        // Set the image
        RequestOptions defaultOptions = new RequestOptions()
                .error(R.drawable.ic_launcher_background);
        Glide.with(mcontext)
                .setDefaultRequestOptions(defaultOptions)
                .load(mniceplace.get(position).getImageUrl())
                .into(((ViewHolder)holder).image);

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onClickInterface.ItemClicked(position);
            }
        });

    }


    @Override
    public int getItemCount() {
        return mniceplace.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
    CircleImageView image ;
    TextView imagename;
    TextView nig;
    RelativeLayout parentlayout;

Result result=new Result();


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            imagename=itemView.findViewById(R.id.image_name);
            nig=itemView.findViewById(R.id.neighborhood);
            parentlayout=itemView.findViewById(R.id.parent_layout);
/*
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ;
                }
            });
*/

        }


    }


    public List<FaqPlaceObj> getPlacesList() {
        return mniceplace;
    }

    public void setMniceplace(List<FaqPlaceObj> mniceplace) {
        this.mniceplace = mniceplace;
    }
}
