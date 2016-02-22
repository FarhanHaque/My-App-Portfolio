package com.example.farhan.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

   // private ArrayAdapter button_text_list_adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Button button= (Button) rootView.findViewById(R.id.button1);

            button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    Toast.makeText(getContext(),"This button will launch Spotify Streamer.", Toast.LENGTH_SHORT).show();

                }
            });

        button= (Button) rootView.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"This button will launch Footbal Scores.", Toast.LENGTH_SHORT).show();

            }
        });

         button= (Button) rootView.findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"This button will launch Library.", Toast.LENGTH_SHORT).show();

            }
        });

        button= (Button) rootView.findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"This button will launch Build It Bigger.", Toast.LENGTH_SHORT).show();
            }
        });

        button= (Button) rootView.findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"This button will launch XYZ Reader.", Toast.LENGTH_SHORT).show();
            }
        });

         button= (Button) rootView.findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"This button will launch Capstone:My Own App.", Toast.LENGTH_SHORT).show();
            }
        });



        return rootView;
    }
}
