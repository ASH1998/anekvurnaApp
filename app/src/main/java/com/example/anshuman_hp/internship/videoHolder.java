package com.example.anshuman_hp.internship;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Anshuman-HP on 20-08-2017.
 */

public class videoHolder extends RecyclerView.ViewHolder{
    CardView view;
    ImageView videoThumbnail;
    TextView videoCaption;
    TextView videoDuration;
    ImageButton shareVideo;
    public videoHolder(View itemView) {
        super(itemView);
        view=(CardView)itemView.findViewById(R.id.videoItemLayout);
        videoThumbnail=(ImageView)itemView.findViewById(R.id.videoThumbnail);
        videoCaption=(TextView)itemView.findViewById(R.id.videoCaption);
        videoDuration=(TextView)itemView.findViewById(R.id.videoDuration);
        shareVideo=(ImageButton)itemView.findViewById(R.id.shareVideo);
    }
}
