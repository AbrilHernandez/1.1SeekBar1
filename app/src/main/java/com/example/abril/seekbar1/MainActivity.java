package com.example.abril.seekbar1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sbr_barra;
    TextView txt_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbr_barra = (SeekBar)findViewById(R.id.sbr_barra);
        txt_res = (TextView)findViewById(R.id.txt_res);

        sbr_barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int texto;
                int numero;
                texto = sbr_barra.getProgress();
                String res2="";


                for(int i=1; i<=9; i++){
                    int res = i*texto;
                    res2 +=texto+"x"+i+"="+(res)+"\n";

                }
                txt_res.setText(res2);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}
