package kennewickpractice.com.funfacts;

import java.util.Random;

/**
 * Created by Ken on 9/11/2015.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
	
	"Rice-a-Roni ("The San Francisco Treat") was based on an Armenian recipe for rice pilaf.",
	"In 1998 Miss Piggy released her own perfume, "Moi." Kermit had previously debuted a cologne called "Amphibia.",
	"Alas poor Yorick, I knew him well" is the most commonly misquoted Shakespeare line. The actual line in Hamlet is: "Alas poor Yorick! I knew him, Horatio.",
	"Your foot is the same size as the distance between your wrist and elbow.",
	" 78% of NFL players are bankrupt two years after finishing their careers",
	" 60% of NBA players are bankrupt within five years of leaving the league",
	" In Utah, it is against the law to fish from the back of a horse",
	" If you put a can of Diet Coke in water, it floats",
	" Also, according to Utah law (where I live) a husband is responsible for any criminal act that his wife commits while in his presence",
	" Apparently, if you eat a Polar Bear liver, you will die of a vitamin A overdose",
	" The number one tire manufacturer in the world? LEGO",
	" If you combine all the ants in the world, they’ll weigh about the same as if you combine all the people",
	" The flamingo can only eat when its head is upside down",
	" Because news travelled so slow back then, slaves in Texas didn’t know they were free for more than two months after Lincoln issued the Emancipation Proclamation",
	" Talk about pressure",
	" There are 18",
	" Humans have had dogs as companions and workers for more than 14,000 years",
	" A snail can sleep for more than three years at a time"
	 };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
