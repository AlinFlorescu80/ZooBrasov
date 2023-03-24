package com.example.zoobrasov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Animale extends AppCompatActivity implements BottomNavigationView.OnItemSelectedListener {

    ImageButton arrow;
    LinearLayout hiddenView;
    CardView cardView;

    ImageButton arrow2;
    LinearLayout hiddenView2;
    CardView cardView2;

    ImageButton arrow3;
    LinearLayout hiddenView3;
    CardView cardView3;

    ImageButton arrow4;
    LinearLayout hiddenView4;
    CardView cardView4;

    ImageButton arrow5;
    LinearLayout hiddenView5;
    CardView cardView5;

    ImageButton arrow6;
    LinearLayout hiddenView6;
    CardView cardView6;

    ImageButton arrow7;
    LinearLayout hiddenView7;
    CardView cardView7;

    ImageButton arrow8;
    LinearLayout hiddenView8;
    CardView cardView8;

    ImageButton arrow9;
    LinearLayout hiddenView9;
    CardView cardView9;

    ImageButton arrow10;
    LinearLayout hiddenView10;
    CardView cardView10;

    ImageButton arrow11;
    LinearLayout hiddenView11;
    CardView cardView11;

    ImageButton arrow12;
    LinearLayout hiddenView12;
    CardView cardView12;

    ImageButton arrow13;
    LinearLayout hiddenView13;
    CardView cardView13;

    ImageButton arrow14;
    LinearLayout hiddenView14;
    CardView cardView14;

    ImageButton arrow15;
    LinearLayout hiddenView15;
    CardView cardView15;

    ImageButton arrow16;
    LinearLayout hiddenView16;
    CardView cardView16;

    ImageButton arrow17;
    LinearLayout hiddenView17;
    CardView cardView17;

    ImageButton arrow18;
    LinearLayout hiddenView18;
    CardView cardView18;

    ImageButton arrow19;
    LinearLayout hiddenView19;
    CardView cardView19;

    ImageButton arrow20;
    LinearLayout hiddenView20;
    CardView cardView20;

    ImageButton arrow21;
    LinearLayout hiddenView21;
    CardView cardView21;

    ImageButton arrow22;
    LinearLayout hiddenView22;
    CardView cardView22;

    ImageButton arrow23;
    LinearLayout hiddenView23;
    CardView cardView23;

    ImageButton arrow24;
    LinearLayout hiddenView24;
    CardView cardView24;

    ImageButton arrow25;
    LinearLayout hiddenView25;
    CardView cardView25;

    ImageButton arrow26;
    LinearLayout hiddenView26;
    CardView cardView26;

    ImageButton arrow27;
    LinearLayout hiddenView27;
    CardView cardView27;

    ImageButton arrow28;
    LinearLayout hiddenView28;
    CardView cardView28;

    ImageButton arrow29;
    LinearLayout hiddenView29;
    CardView cardView29;

    ImageButton arrow30;
    LinearLayout hiddenView30;
    CardView cardView30;

    ImageButton arrow31;
    LinearLayout hiddenView31;
    CardView cardView31;

    ImageButton arrow32;
    LinearLayout hiddenView32;
    CardView cardView32;

    ImageButton arrow33;
    LinearLayout hiddenView33;
    CardView cardView33;

    ImageButton arrow34;
    LinearLayout hiddenView34;
    CardView cardView34;

    ImageButton arrow35;
    LinearLayout hiddenView35;
    CardView cardView35;

    ImageButton arrow36;
    LinearLayout hiddenView36;
    CardView cardView36;

    ImageButton arrow37;
    LinearLayout hiddenView37;
    CardView cardView37;

    ImageButton arrow38;
    LinearLayout hiddenView38;
    CardView cardView38;

    ImageButton arrow39;
    LinearLayout hiddenView39;
    CardView cardView39;

    ImageButton arrow40;
    LinearLayout hiddenView40;
    CardView cardView40;

    ImageButton arrow41;
    LinearLayout hiddenView41;
    CardView cardView41;

    ImageButton arrow42;
    LinearLayout hiddenView42;
    CardView cardView42;

    ImageButton arrow43;
    LinearLayout hiddenView43;
    CardView cardView43;

    ImageButton arrow44;
    LinearLayout hiddenView44;
    CardView cardView44;

    ImageButton arrow45;
    LinearLayout hiddenView45;
    CardView cardView45;

    ImageButton arrow46;
    LinearLayout hiddenView46;
    CardView cardView46;

    ImageButton arrow47;
    LinearLayout hiddenView47;
    CardView cardView47;

    ImageButton arrow48;
    LinearLayout hiddenView48;
    CardView cardView48;

    ImageButton arrow49;
    LinearLayout hiddenView49;
    CardView cardView49;

    ImageButton arrow50;
    LinearLayout hiddenView50;
    CardView cardView50;

    ImageButton arrow51;
    LinearLayout hiddenView51;
    CardView cardView51;

    ImageButton arrow52;
    LinearLayout hiddenView52;
    CardView cardView52;

    ImageButton arrow53;
    LinearLayout hiddenView53;
    CardView cardView53;

    ImageButton arrow54;
    LinearLayout hiddenView54;
    CardView cardView54;

    BottomNavigationView bottomNavigationView;




        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_animale);
            bottomNavigationView = findViewById(R.id.bottomNavigationView2);
            bottomNavigationView.setOnItemSelectedListener(this);




            cardView = findViewById(R.id.base_cardview);
            arrow = findViewById(R.id.arrow_button);
            hiddenView = findViewById(R.id.hidden_view);
            hiddenView.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

            arrow.setOnClickListener(view -> {

                if (hiddenView.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView2 = findViewById(R.id.base_cardview2);
            arrow2 = findViewById(R.id.arrow_button2);
            hiddenView2 = findViewById(R.id.hidden_view2);
            hiddenView2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


            arrow2.setOnClickListener(view -> {

                if (hiddenView2.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    hiddenView2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    hiddenView2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView3 = findViewById(R.id.base_cardview3);
            arrow3 = findViewById(R.id.arrow_button3);
            hiddenView3 = findViewById(R.id.hidden_view3);

            arrow3.setOnClickListener(view -> {

                if (hiddenView3.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    hiddenView3.setVisibility(View.GONE);
                    arrow3.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    hiddenView3.setVisibility(View.VISIBLE);
                    arrow3.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView4 = findViewById(R.id.base_cardview4);
            arrow4 = findViewById(R.id.arrow_button4);
            hiddenView4 = findViewById(R.id.hidden_view4);

            arrow4.setOnClickListener(view -> {

                if (hiddenView4.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    hiddenView4.setVisibility(View.GONE);
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    hiddenView4.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });











            cardView5 = findViewById(R.id.base_cardview5);
            arrow5 = findViewById(R.id.arrow_button5);
            hiddenView5 = findViewById(R.id.hidden_view5);

            arrow5.setOnClickListener(view -> {

                if (hiddenView5.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    hiddenView5.setVisibility(View.GONE);
                    arrow5.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    hiddenView5.setVisibility(View.VISIBLE);
                    arrow5.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });












            cardView6 = findViewById(R.id.base_cardview6);
            arrow6 = findViewById(R.id.arrow_button6);
            hiddenView6 = findViewById(R.id.hidden_view6);

            arrow6.setOnClickListener(view -> {

                if (hiddenView6.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    hiddenView6.setVisibility(View.GONE);
                    arrow6.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    hiddenView6.setVisibility(View.VISIBLE);
                    arrow6.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });












            cardView7 = findViewById(R.id.base_cardview7);
            arrow7 = findViewById(R.id.arrow_button7);
            hiddenView7 = findViewById(R.id.hidden_view7);

            arrow7.setOnClickListener(view -> {

                if (hiddenView7.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    hiddenView7.setVisibility(View.GONE);
                    arrow7.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    hiddenView7.setVisibility(View.VISIBLE);
                    arrow7.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });













            cardView8 = findViewById(R.id.base_cardview8);
            arrow8 = findViewById(R.id.arrow_button8);
            hiddenView8 = findViewById(R.id.hidden_view8);

            arrow8.setOnClickListener(view -> {

                if (hiddenView8.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    hiddenView8.setVisibility(View.GONE);
                    arrow8.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    hiddenView8.setVisibility(View.VISIBLE);
                    arrow8.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView9 = findViewById(R.id.base_cardview9);
            arrow9 = findViewById(R.id.arrow_button9);
            hiddenView9 = findViewById(R.id.hidden_view9);

            arrow9.setOnClickListener(view -> {

                if (hiddenView9.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    hiddenView9.setVisibility(View.GONE);
                    arrow9.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    hiddenView9.setVisibility(View.VISIBLE);
                    arrow9.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView10 = findViewById(R.id.base_cardview10);
            arrow10 = findViewById(R.id.arrow_button10);
            hiddenView10 = findViewById(R.id.hidden_view10);

            arrow10.setOnClickListener(view -> {
                if (hiddenView10.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                    hiddenView10.setVisibility(View.GONE);
                    arrow10.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                    hiddenView10.setVisibility(View.VISIBLE);
                    arrow10.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });




            cardView11 = findViewById(R.id.base_cardview11);
            arrow11 = findViewById(R.id.arrow_button11);
            hiddenView11 = findViewById(R.id.hidden_view11);

            arrow11.setOnClickListener(view -> {
                if (hiddenView11.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                    hiddenView11.setVisibility(View.GONE);
                    arrow11.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                    hiddenView11.setVisibility(View.VISIBLE);
                    arrow11.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView12 = findViewById(R.id.base_cardview12);
            arrow12 = findViewById(R.id.arrow_button12);
            hiddenView12 = findViewById(R.id.hidden_view12);

            arrow12.setOnClickListener(view -> {
                if (hiddenView12.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                    hiddenView12.setVisibility(View.GONE);
                    arrow12.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                    hiddenView12.setVisibility(View.VISIBLE);
                    arrow12.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView13 = findViewById(R.id.base_cardview13);
            arrow13 = findViewById(R.id.arrow_button13);
            hiddenView13 = findViewById(R.id.hidden_view13);

            arrow13.setOnClickListener(view -> {
                if (hiddenView13.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                    hiddenView13.setVisibility(View.GONE);
                    arrow13.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                    hiddenView13.setVisibility(View.VISIBLE);
                    arrow13.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView14 = findViewById(R.id.base_cardview14);
            arrow14 = findViewById(R.id.arrow_button14);
            hiddenView14 = findViewById(R.id.hidden_view14);

            arrow14.setOnClickListener(view -> {
                if (hiddenView14.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                    hiddenView14.setVisibility(View.GONE);
                    arrow14.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                    hiddenView14.setVisibility(View.VISIBLE);
                    arrow14.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });







            cardView15 = findViewById(R.id.base_cardview15);
            arrow15 = findViewById(R.id.arrow_button15);
            hiddenView15 = findViewById(R.id.hidden_view15);

            arrow15.setOnClickListener(view -> {
                if (hiddenView15.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                    hiddenView15.setVisibility(View.GONE);
                    arrow15.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                    hiddenView15.setVisibility(View.VISIBLE);
                    arrow15.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView16 = findViewById(R.id.base_cardview16);
            arrow16 = findViewById(R.id.arrow_button16);
            hiddenView16 = findViewById(R.id.hidden_view16);

            arrow16.setOnClickListener(view -> {
                if (hiddenView16.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                    hiddenView16.setVisibility(View.GONE);
                    arrow16.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                    hiddenView16.setVisibility(View.VISIBLE);
                    arrow16.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView17 = findViewById(R.id.base_cardview17);
            arrow17 = findViewById(R.id.arrow_button17);
            hiddenView17 = findViewById(R.id.hidden_view17);

            arrow17.setOnClickListener(view -> {
                if (hiddenView17.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                    hiddenView17.setVisibility(View.GONE);
                    arrow17.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                    hiddenView17.setVisibility(View.VISIBLE);
                    arrow17.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView18 = findViewById(R.id.base_cardview18);
            arrow18 = findViewById(R.id.arrow_button18);
            hiddenView18 = findViewById(R.id.hidden_view18);

            arrow18.setOnClickListener(view -> {
                if (hiddenView18.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                    hiddenView18.setVisibility(View.GONE);
                    arrow18.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                    hiddenView18.setVisibility(View.VISIBLE);
                    arrow18.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView19 = findViewById(R.id.base_cardview19);
            arrow19 = findViewById(R.id.arrow_button19);
            hiddenView19 = findViewById(R.id.hidden_view19);

            arrow19.setOnClickListener(view -> {
                if (hiddenView19.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                    hiddenView19.setVisibility(View.GONE);
                    arrow19.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                    hiddenView19.setVisibility(View.VISIBLE);
                    arrow19.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });




            cardView20 = findViewById(R.id.base_cardview20);
            arrow20 = findViewById(R.id.arrow_button20);
            hiddenView20 = findViewById(R.id.hidden_view20);

            arrow20.setOnClickListener(view -> {
                if (hiddenView20.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                    hiddenView20.setVisibility(View.GONE);
                    arrow20.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                    hiddenView20.setVisibility(View.VISIBLE);
                    arrow20.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });




            cardView21 = findViewById(R.id.base_cardview21);
            arrow21 = findViewById(R.id.arrow_button21);
            hiddenView21 = findViewById(R.id.hidden_view21);

            arrow21.setOnClickListener(view -> {
                if (hiddenView21.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                    hiddenView21.setVisibility(View.GONE);
                    arrow21.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                    hiddenView21.setVisibility(View.VISIBLE);
                    arrow21.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });



            cardView22 = findViewById(R.id.base_cardview22);
            arrow22 = findViewById(R.id.arrow_button22);
            hiddenView22 = findViewById(R.id.hidden_view22);

            arrow22.setOnClickListener(view -> {
                if (hiddenView22.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                    hiddenView22.setVisibility(View.GONE);
                    arrow22.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                    hiddenView22.setVisibility(View.VISIBLE);
                    arrow22.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView23 = findViewById(R.id.base_cardview23);
            arrow23 = findViewById(R.id.arrow_button23);
            hiddenView23 = findViewById(R.id.hidden_view23);

            arrow23.setOnClickListener(view -> {
                if (hiddenView23.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                    hiddenView23.setVisibility(View.GONE);
                    arrow23.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                    hiddenView23.setVisibility(View.VISIBLE);
                    arrow23.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });







            cardView24 = findViewById(R.id.base_cardview24);
            arrow24 = findViewById(R.id.arrow_button24);
            hiddenView24 = findViewById(R.id.hidden_view24);

            arrow24.setOnClickListener(view -> {
                if (hiddenView24.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                    hiddenView24.setVisibility(View.GONE);
                    arrow24.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                    hiddenView24.setVisibility(View.VISIBLE);
                    arrow24.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView25 = findViewById(R.id.base_cardview25);
            arrow25 = findViewById(R.id.arrow_button25);
            hiddenView25 = findViewById(R.id.hidden_view25);

            arrow25.setOnClickListener(view -> {
                if (hiddenView25.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView25, new AutoTransition());
                    hiddenView25.setVisibility(View.GONE);
                    arrow25.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView25, new AutoTransition());
                    hiddenView25.setVisibility(View.VISIBLE);
                    arrow25.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView26 = findViewById(R.id.base_cardview26);
            arrow26 = findViewById(R.id.arrow_button26);
            hiddenView26 = findViewById(R.id.hidden_view26);

            arrow26.setOnClickListener(view -> {
                if (hiddenView26.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView26, new AutoTransition());
                    hiddenView26.setVisibility(View.GONE);
                    arrow26.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView26, new AutoTransition());
                    hiddenView26.setVisibility(View.VISIBLE);
                    arrow26.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });




            cardView27 = findViewById(R.id.base_cardview27);
            arrow27 = findViewById(R.id.arrow_button27);
            hiddenView27 = findViewById(R.id.hidden_view27);

            arrow27.setOnClickListener(view -> {
                if (hiddenView27.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView27, new AutoTransition());
                    hiddenView27.setVisibility(View.GONE);
                    arrow27.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView27, new AutoTransition());
                    hiddenView27.setVisibility(View.VISIBLE);
                    arrow27.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView28 = findViewById(R.id.base_cardview28);
            arrow28 = findViewById(R.id.arrow_button28);
            hiddenView28 = findViewById(R.id.hidden_view28);

            arrow28.setOnClickListener(view -> {
                if (hiddenView28.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView28, new AutoTransition());
                    hiddenView28.setVisibility(View.GONE);
                    arrow28.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView28, new AutoTransition());
                    hiddenView28.setVisibility(View.VISIBLE);
                    arrow28.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView29 = findViewById(R.id.base_cardview29);
            arrow29 = findViewById(R.id.arrow_button29);
            hiddenView29 = findViewById(R.id.hidden_view29);

            arrow29.setOnClickListener(view -> {
                if (hiddenView29.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView29, new AutoTransition());
                    hiddenView29.setVisibility(View.GONE);
                    arrow29.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView29, new AutoTransition());
                    hiddenView29.setVisibility(View.VISIBLE);
                    arrow29.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView30 = findViewById(R.id.base_cardview30);
            arrow30 = findViewById(R.id.arrow_button30);
            hiddenView30 = findViewById(R.id.hidden_view30);

            arrow30.setOnClickListener(view -> {
                if (hiddenView30.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView30, new AutoTransition());
                    hiddenView30.setVisibility(View.GONE);
                    arrow30.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView30, new AutoTransition());
                    hiddenView30.setVisibility(View.VISIBLE);
                    arrow30.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView31 = findViewById(R.id.base_cardview31);
            arrow31 = findViewById(R.id.arrow_button31);
            hiddenView31 = findViewById(R.id.hidden_view31);

            arrow31.setOnClickListener(view -> {
                if (hiddenView31.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView31, new AutoTransition());
                    hiddenView31.setVisibility(View.GONE);
                    arrow31.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView31, new AutoTransition());
                    hiddenView31.setVisibility(View.VISIBLE);
                    arrow31.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView32 = findViewById(R.id.base_cardview32);
            arrow32 = findViewById(R.id.arrow_button32);
            hiddenView32 = findViewById(R.id.hidden_view32);

            arrow32.setOnClickListener(view -> {
                if (hiddenView32.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView32, new AutoTransition());
                    hiddenView32.setVisibility(View.GONE);
                    arrow32.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView32, new AutoTransition());
                    hiddenView32.setVisibility(View.VISIBLE);
                    arrow32.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView33 = findViewById(R.id.base_cardview33);
            arrow33 = findViewById(R.id.arrow_button33);
            hiddenView33 = findViewById(R.id.hidden_view33);

            arrow33.setOnClickListener(view -> {
                if (hiddenView33.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView33, new AutoTransition());
                    hiddenView33.setVisibility(View.GONE);
                    arrow33.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView33, new AutoTransition());
                    hiddenView33.setVisibility(View.VISIBLE);
                    arrow33.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView34 = findViewById(R.id.base_cardview34);
            arrow34 = findViewById(R.id.arrow_button34);
            hiddenView34 = findViewById(R.id.hidden_view34);

            arrow34.setOnClickListener(view -> {
                if (hiddenView34.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView34, new AutoTransition());
                    hiddenView34.setVisibility(View.GONE);
                    arrow34.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView34, new AutoTransition());
                    hiddenView34.setVisibility(View.VISIBLE);
                    arrow34.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });













            cardView35 = findViewById(R.id.base_cardview35);
            arrow35 = findViewById(R.id.arrow_button35);
            hiddenView35 = findViewById(R.id.hidden_view35);

            arrow35.setOnClickListener(view -> {
                if (hiddenView35.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView35, new AutoTransition());
                    hiddenView35.setVisibility(View.GONE);
                    arrow35.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView35, new AutoTransition());
                    hiddenView35.setVisibility(View.VISIBLE);
                    arrow35.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView36 = findViewById(R.id.base_cardview36);
            arrow36 = findViewById(R.id.arrow_button36);
            hiddenView36 = findViewById(R.id.hidden_view36);

            arrow36.setOnClickListener(view -> {
                if (hiddenView36.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView36, new AutoTransition());
                    hiddenView36.setVisibility(View.GONE);
                    arrow36.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView36, new AutoTransition());
                    hiddenView36.setVisibility(View.VISIBLE);
                    arrow36.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });











            cardView37 = findViewById(R.id.base_cardview37);
            arrow37 = findViewById(R.id.arrow_button37);
            hiddenView37 = findViewById(R.id.hidden_view37);

            arrow37.setOnClickListener(view -> {
                if (hiddenView37.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView37, new AutoTransition());
                    hiddenView37.setVisibility(View.GONE);
                    arrow37.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView37, new AutoTransition());
                    hiddenView37.setVisibility(View.VISIBLE);
                    arrow37.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView38 = findViewById(R.id.base_cardview38);
            arrow38 = findViewById(R.id.arrow_button38);
            hiddenView38 = findViewById(R.id.hidden_view38);

            arrow38.setOnClickListener(view -> {
                if (hiddenView38.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView38, new AutoTransition());
                    hiddenView38.setVisibility(View.GONE);
                    arrow38.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView38, new AutoTransition());
                    hiddenView38.setVisibility(View.VISIBLE);
                    arrow38.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });


            cardView39 = findViewById(R.id.base_cardview39);
            arrow39 = findViewById(R.id.arrow_button39);
            hiddenView39 = findViewById(R.id.hidden_view39);

            arrow39.setOnClickListener(view -> {
                if (hiddenView39.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView39, new AutoTransition());
                    hiddenView39.setVisibility(View.GONE);
                    arrow39.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView39, new AutoTransition());
                    hiddenView39.setVisibility(View.VISIBLE);
                    arrow39.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });






            cardView40 = findViewById(R.id.base_cardview40);
            arrow40 = findViewById(R.id.arrow_button40);
            hiddenView40 = findViewById(R.id.hidden_view40);

            arrow40.setOnClickListener(view -> {
                if (hiddenView40.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView40, new AutoTransition());
                    hiddenView40.setVisibility(View.GONE);
                    arrow40.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView40, new AutoTransition());
                    hiddenView40.setVisibility(View.VISIBLE);
                    arrow40.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });







            cardView41 = findViewById(R.id.base_cardview41);
            arrow41 = findViewById(R.id.arrow_button41);
            hiddenView41 = findViewById(R.id.hidden_view41);

            arrow41.setOnClickListener(view -> {
                if (hiddenView41.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView41, new AutoTransition());
                    hiddenView41.setVisibility(View.GONE);
                    arrow41.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView41, new AutoTransition());
                    hiddenView41.setVisibility(View.VISIBLE);
                    arrow41.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView42 = findViewById(R.id.base_cardview42);
            arrow42 = findViewById(R.id.arrow_button42);
            hiddenView42 = findViewById(R.id.hidden_view42);

            arrow42.setOnClickListener(view -> {
                if (hiddenView42.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView42, new AutoTransition());
                    hiddenView42.setVisibility(View.GONE);
                    arrow42.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView42, new AutoTransition());
                    hiddenView42.setVisibility(View.VISIBLE);
                    arrow42.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });







            cardView43 = findViewById(R.id.base_cardview43);
            arrow43 = findViewById(R.id.arrow_button43);
            hiddenView43 = findViewById(R.id.hidden_view43);

            arrow43.setOnClickListener(view -> {
                if (hiddenView43.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView43, new AutoTransition());
                    hiddenView43.setVisibility(View.GONE);
                    arrow43.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView43, new AutoTransition());
                    hiddenView43.setVisibility(View.VISIBLE);
                    arrow43.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView44 = findViewById(R.id.base_cardview44);
            arrow44 = findViewById(R.id.arrow_button44);
            hiddenView44 = findViewById(R.id.hidden_view44);

            arrow44.setOnClickListener(view -> {
                if (hiddenView44.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView44, new AutoTransition());
                    hiddenView44.setVisibility(View.GONE);
                    arrow44.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView44, new AutoTransition());
                    hiddenView44.setVisibility(View.VISIBLE);
                    arrow44.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });








            cardView45 = findViewById(R.id.base_cardview45);
            arrow45 = findViewById(R.id.arrow_button45);
            hiddenView45 = findViewById(R.id.hidden_view45);

            arrow45.setOnClickListener(view -> {
                if (hiddenView45.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView45, new AutoTransition());
                    hiddenView45.setVisibility(View.GONE);
                    arrow45.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView45, new AutoTransition());
                    hiddenView45.setVisibility(View.VISIBLE);
                    arrow45.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView46 = findViewById(R.id.base_cardview46);
            arrow46 = findViewById(R.id.arrow_button46);
            hiddenView46 = findViewById(R.id.hidden_view46);

            arrow46.setOnClickListener(view -> {
                if (hiddenView46.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView46, new AutoTransition());
                    hiddenView46.setVisibility(View.GONE);
                    arrow46.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView46, new AutoTransition());
                    hiddenView46.setVisibility(View.VISIBLE);
                    arrow46.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView47 = findViewById(R.id.base_cardview47);
            arrow47 = findViewById(R.id.arrow_button47);
            hiddenView47 = findViewById(R.id.hidden_view47);

            arrow47.setOnClickListener(view -> {
                if (hiddenView47.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView47, new AutoTransition());
                    hiddenView47.setVisibility(View.GONE);
                    arrow47.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView47, new AutoTransition());
                    hiddenView47.setVisibility(View.VISIBLE);
                    arrow47.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView48 = findViewById(R.id.base_cardview48);
            arrow48 = findViewById(R.id.arrow_button48);
            hiddenView48 = findViewById(R.id.hidden_view48);

            arrow48.setOnClickListener(view -> {
                if (hiddenView48.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView48, new AutoTransition());
                    hiddenView48.setVisibility(View.GONE);
                    arrow48.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView48, new AutoTransition());
                    hiddenView48.setVisibility(View.VISIBLE);
                    arrow48.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });





            cardView49 = findViewById(R.id.base_cardview49);
            arrow49 = findViewById(R.id.arrow_button49);
            hiddenView49 = findViewById(R.id.hidden_view49);

            arrow49.setOnClickListener(view -> {
                if (hiddenView49.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView49, new AutoTransition());
                    hiddenView49.setVisibility(View.GONE);
                    arrow49.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView49, new AutoTransition());
                    hiddenView49.setVisibility(View.VISIBLE);
                    arrow49.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView50 = findViewById(R.id.base_cardview50);
            arrow50 = findViewById(R.id.arrow_button50);
            hiddenView50 = findViewById(R.id.hidden_view50);

            arrow50.setOnClickListener(view -> {
                if (hiddenView50.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView50, new AutoTransition());
                    hiddenView50.setVisibility(View.GONE);
                    arrow50.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView50, new AutoTransition());
                    hiddenView50.setVisibility(View.VISIBLE);
                    arrow50.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView51 = findViewById(R.id.base_cardview51);
            arrow51 = findViewById(R.id.arrow_button51);
            hiddenView51 = findViewById(R.id.hidden_view51);

            arrow51.setOnClickListener(view -> {
                if (hiddenView51.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView51, new AutoTransition());
                    hiddenView51.setVisibility(View.GONE);
                    arrow51.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView51, new AutoTransition());
                    hiddenView51.setVisibility(View.VISIBLE);
                    arrow51.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });







            cardView52 = findViewById(R.id.base_cardview52);
            arrow52 = findViewById(R.id.arrow_button52);
            hiddenView52 = findViewById(R.id.hidden_view52);

            arrow52.setOnClickListener(view -> {
                if (hiddenView52.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView52, new AutoTransition());
                    hiddenView52.setVisibility(View.GONE);
                    arrow52.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView52, new AutoTransition());
                    hiddenView52.setVisibility(View.VISIBLE);
                    arrow52.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });










            cardView53 = findViewById(R.id.base_cardview53);
            arrow53 = findViewById(R.id.arrow_button53);
            hiddenView53 = findViewById(R.id.hidden_view53);

            arrow53.setOnClickListener(view -> {
                if (hiddenView53.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView53, new AutoTransition());
                    hiddenView53.setVisibility(View.GONE);
                    arrow53.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView53, new AutoTransition());
                    hiddenView53.setVisibility(View.VISIBLE);
                    arrow53.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });









            cardView54 = findViewById(R.id.base_cardview54);
            arrow54 = findViewById(R.id.arrow_button54);
            hiddenView54 = findViewById(R.id.hidden_view54);

            arrow54.setOnClickListener(view -> {
                if (hiddenView54.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView54, new AutoTransition());
                    hiddenView54.setVisibility(View.GONE);
                    arrow54.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }


                else {
                    TransitionManager.beginDelayedTransition(cardView54, new AutoTransition());
                    hiddenView54.setVisibility(View.VISIBLE);
                    arrow54.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            });
        }


        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            int id = item.getItemId();

            TextView tv = findViewById(R.id.mamiferetext);
            TextView tv1 = findViewById(R.id.pasaritext);
            TextView tv2 = findViewById(R.id.pestitext);
            TextView tv3 = findViewById(R.id.reptiletext);

            ScrollView sv =  findViewById(R.id.scrollview);
            switch(id){
                case R.id.mamifer:
                    sv.scrollTo(0, tv.getTop());
                    break;

                case R.id.bird:
                    sv.scrollTo(0, tv1.getTop());

                    break;

                case R.id.fish:
                    sv.scrollTo(0, tv2.getTop());

                    break;

                case R.id.reptila:
                    sv.scrollTo(0, tv3.getTop());

                    break;

            }
            return false;
        }




    }
