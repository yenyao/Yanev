package com.example.yanev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView iv_deck, player_card1, player_card2, player_card3, player_card4, player_card5, opp_card1, opp_card2, opp_card3, opp_card4, opp_card5;
    Button deal;

    ArrayList<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deal = (Button) findViewById(R.id.deal);
        iv_deck = (ImageView) findViewById(R.id.iv_deck);
        player_card1 = (ImageView) findViewById(R.id.player_card1);
        player_card2 = (ImageView) findViewById(R.id.player_card2);
        player_card3 = (ImageView) findViewById(R.id.player_card3);
        player_card4 = (ImageView) findViewById(R.id.player_card4);
        player_card5 = (ImageView) findViewById(R.id.player_card5);
        opp_card1 = (ImageView) findViewById(R.id.opp_card1);
        opp_card2 = (ImageView) findViewById(R.id.opp_card2);
        opp_card3 = (ImageView) findViewById(R.id.opp_card3);
        opp_card4 = (ImageView) findViewById(R.id.opp_card4);
        opp_card5 = (ImageView) findViewById(R.id.opp_card5);

        player_card1.setVisibility(View.INVISIBLE);
        player_card2.setVisibility(View.INVISIBLE);
        player_card3.setVisibility(View.INVISIBLE);
        player_card4.setVisibility(View.INVISIBLE);
        player_card5.setVisibility(View.INVISIBLE);
        opp_card1.setVisibility(View.INVISIBLE);
        opp_card2.setVisibility(View.INVISIBLE);
        opp_card3.setVisibility(View.INVISIBLE);
        opp_card4.setVisibility(View.INVISIBLE);
        opp_card5.setVisibility(View.INVISIBLE);

        cards = new ArrayList<>();

        cards.add(101); // Ace of spades
        cards.add(102); // 2 of spades
        cards.add(103); // 3 of spades
        cards.add(104); // 4 of spades
        cards.add(105); // 5 of spades
        cards.add(106); // 6 of spades
        cards.add(107); // 7 of spades
        cards.add(108); // 8 of spades
        cards.add(109); // 9 of spades
        cards.add(110); // 10 of spades
        cards.add(111); // J of spades
        cards.add(112); // Q of spades
        cards.add(113); // K of spades
        cards.add(201); // Ace of Clubs
        cards.add(202); // 2 of Clubs
        cards.add(203); // 3 of Clubs
        cards.add(204); // 4 of Clubs
        cards.add(205); // 5 of Clubs
        cards.add(206); // 6 of Clubs
        cards.add(207); // 7 of Clubs
        cards.add(208); // 8 of Clubs
        cards.add(209); // 9 of Clubs
        cards.add(210); // 10 of Clubs
        cards.add(211); // J of Clubs
        cards.add(212); // Q of Clubs
        cards.add(213); // K of Clubs
        cards.add(301); // Ace of Diamonds
        cards.add(302); // 2 of Diamonds
        cards.add(303); // 3 of Diamonds
        cards.add(304); // 4 of Diamonds
        cards.add(305); // 5 of Diamonds
        cards.add(306); // 6 of Diamonds
        cards.add(307); // 7 of Diamonds
        cards.add(308); // 8 of Diamonds
        cards.add(309); // 9 of Diamonds
        cards.add(310); // 10 of Diamonds
        cards.add(311); // J of Diamonds
        cards.add(312); // Q of Diamonds
        cards.add(313); // K of Diamonds
        cards.add(401); // Ace of Hearts
        cards.add(402); // 2 of Hearts
        cards.add(403); // 3 of Hearts
        cards.add(404); // 4 of Hearts
        cards.add(405); // 5 of Hearts
        cards.add(406); // 6 of Hearts
        cards.add(407); // 7 of Hearts
        cards.add(408); // 8 of Hearts
        cards.add(409); // 9 of Hearts
        cards.add(410); // 10 of Hearts
        cards.add(411); // J of Hearts
        cards.add(412); // Q of Hearts
        cards.add(413); // K of Hearts
        cards.add(500); // Black Joker
        cards.add(600); // Red Joker

        deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Shuffle deck
                Collections.shuffle(cards);

                // Deal 5 cards to each player
                assignImages(cards.get(0), player_card1);
                assignImages(cards.get(1), opp_card1);
                assignImages(cards.get(2), player_card2);
                assignImages(cards.get(3), opp_card2);
                assignImages(cards.get(4), player_card3);
                assignImages(cards.get(5), opp_card3);
                assignImages(cards.get(6), player_card4);
                assignImages(cards.get(7), opp_card4);
                assignImages(cards.get(8), player_card5);
                assignImages(cards.get(9), opp_card5);

                //Show player cards
                player_card1.setVisibility(View.VISIBLE);
                player_card2.setVisibility(View.VISIBLE);
                player_card3.setVisibility(View.VISIBLE);
                player_card4.setVisibility(View.VISIBLE);
                player_card5.setVisibility(View.VISIBLE);

                opp_card1.setVisibility(View.VISIBLE);
                opp_card2.setVisibility(View.VISIBLE);
                opp_card3.setVisibility(View.VISIBLE);
                opp_card4.setVisibility(View.VISIBLE);
                opp_card5.setVisibility(View.VISIBLE);
            }
        });
    }

    public void assignImages(int card, ImageView image) {
        switch(card) {
            case 101:
                image.setImageResource(R.drawable.aceS);
                break;
            case 102:
                image.setImageResource(R.drawable.twoS);
                break;
            case 103:
                image.setImageResource(R.drawable.threeS);
                break;
            case 104:
                image.setImageResource(R.drawable.fourS);
                break;
            case 105:
                image.setImageResource(R.drawable.fiveS);
                break;
            case 106:
                image.setImageResource(R.drawable.sixS);
                break;
            case 107:
                image.setImageResource(R.drawable.sevenS);
                break;
            case 108:
                image.setImageResource(R.drawable.eightS);
                break;
            case 109:
                image.setImageResource(R.drawable.nineS);
                break;
            case 110:
                image.setImageResource(R.drawable.tenS);
                break;
            case 111:
                image.setImageResource(R.drawable.jS);
                break;
            case 112:
                image.setImageResource(R.drawable.qS);
                break;
            case 113:
                image.setImageResource(R.drawable.kS);
                break;
            case 201:
                image.setImageResource(R.drawable.aceC);
                break;
            case 202:
                image.setImageResource(R.drawable.twoC);
                break;
            case 203:
                image.setImageResource(R.drawable.threeC);
                break;
            case 204:
                image.setImageResource(R.drawable.fourC);
                break;
            case 205:
                image.setImageResource(R.drawable.fiveC);
                break;
            case 206:
                image.setImageResource(R.drawable.sixC);
                break;
            case 207:
                image.setImageResource(R.drawable.sevenC);
                break;
            case 208:
                image.setImageResource(R.drawable.eightC);
                break;
            case 209:
                image.setImageResource(R.drawable.nineC);
                break;
            case 210:
                image.setImageResource(R.drawable.tenC);
                break;
            case 211:
                image.setImageResource(R.drawable.jC);
                break;
            case 212:
                image.setImageResource(R.drawable.qC);
                break;
            case 213:
                image.setImageResource(R.drawable.kC);
                break;
            case 301:
                image.setImageResource(R.drawable.aceD);
                break;
            case 302:
                image.setImageResource(R.drawable.twoD);
                break;
            case 303:
                image.setImageResource(R.drawable.threeD);
                break;
            case 304:
                image.setImageResource(R.drawable.fourD);
                break;
            case 305:
                image.setImageResource(R.drawable.fiveD);
                break;
            case 306:
                image.setImageResource(R.drawable.sixD);
                break;
            case 307:
                image.setImageResource(R.drawable.sevenD);
                break;
            case 308:
                image.setImageResource(R.drawable.eightD);
                break;
            case 309:
                image.setImageResource(R.drawable.nineD);
                break;
            case 310:
                image.setImageResource(R.drawable.tenD);
                break;
            case 311:
                image.setImageResource(R.drawable.jD);
                break;
            case 312:
                image.setImageResource(R.drawable.qD);
                break;
            case 313:
                image.setImageResource(R.drawable.kD);
                break;
            case 401:
                image.setImageResource(R.drawable.aceH);
                break;
            case 402:
                image.setImageResource(R.drawable.twoH);
                break;
            case 403:
                image.setImageResource(R.drawable.threeH);
                break;
            case 404:
                image.setImageResource(R.drawable.fourH);
                break;
            case 405:
                image.setImageResource(R.drawable.fiveH);
                break;
            case 406:
                image.setImageResource(R.drawable.sixH);
                break;
            case 407:
                image.setImageResource(R.drawable.sevenH);
                break;
            case 408:
                image.setImageResource(R.drawable.eightH);
                break;
            case 409:
                image.setImageResource(R.drawable.nineH);
                break;
            case 410:
                image.setImageResource(R.drawable.tenH);
                break;
            case 411:
                image.setImageResource(R.drawable.jH);
                break;
            case 412:
                image.setImageResource(R.drawable.qH);
                break;
            case 413:
                image.setImageResource(R.drawable.kH);
                break;
            case 500:
                image.setImageResource(R.drawable.bJoker);
                break;
            case 600:
                image.setImageResource(R.drawable.rJoker);
                break;
        }
    }
}
