import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class rps {
	public static int checkValidIntegerEntry(BufferedReader in) throws IOException
    {
        boolean correctIntEntered = false; 
        int valueEntered = 0; 

        while (!correctIntEntered)
        {
            try {
                valueEntered = Integer.parseInt(in.readLine());
                correctIntEntered = true; 
            } catch (Exception e) {
                correctIntEntered = false; 
                System.out.print("\nInvalid integer entered: Try again "); 
            }
        }
        return valueEntered; 
    }
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int input = 0;
	    
	    Random rand = new Random();
	    
	    List<String> attacks = new ArrayList<String>();
	    
	    //creates the list of attacks possible
	    attacks.add("1. SQLi - 10 points - occurs when an attacker inserts malicious code into a server that uses SQL and forces the server to reveal information it normally would not");
	    attacks.add("\n 2. DDoS - 10 points - A denial-of-service attack floods systems, servers, or networks with traffic to exhaust resources and bandwidth. As a result, the system is unable to fulfill legitimate requests.");
	    attacks.add("\n 3. Trojan horse - 10 points - any malware that misleads users of its true intent");
	    attacks.add("\n 4. Phishing - 10 points - the practice of sending fraudulent communications that appear to come from a reputable source, usually through email. The goal is to steal sensitive data like credit card and login information or to install malware on the victim’s machine.");
	    attacks.add("\n 5. Worm - 10 points - can propagate or self-replicate from one computer to another without human activation after breaching a system");
	    attacks.add("\n 6. Time Bomb - 10 points - part of a computer program that has been written so that it will start or stop functioning after a predetermined date or time is reached");
	    attacks.add("\n 7. Ransomware - 10 points - victim’s system is held hostage until they agree to pay a ransom to the attacker");
	    
	    List<String> defences = new ArrayList<String>();
	    defences.add("1. Data Encryption - 10 points - Defends against possible SQL injections");
	    defences.add("\n 2. Firewall - 10 points - Filters traffic and may be usedful against DDoS attacks");
	    defences.add("\n 3. Employee Training - 10 points - teaches your employees best practices to avoid attacks");
	    defences.add("\n 4. Additional Employee Training - 10 points - decreases the chance of a phishing");
	    defences.add("\n 5. Intrusion Detection System - 10 points - detects intruders and possible worms");
	    defences.add("\n 6. Decrease Attack Surface - 10 points - reduces the success odds of all attacks");
	    defences.add("\n 7. Virus Scan - 10 points - Protects against time bombs and trojan horses");
	    
	    int a_points = 70;
	    int d_points = 70;
	    
	    int a_score = 0;
	    int d_score = 0;

		attack attacker = new attack(); 
		defend defender = new defend(); 
	    
	    // have a list of bought attacks and defenses
	    // append to them list each time
	    // 1 point per win 
	    // seven days assures no one ties
	    
	    // defense 1 counters atk 1; 2 and 2; 3 reduces chance of 3; 4 for 4; 5 for 5; 7 counters 6; 7 is unaccounted for; 6 decreases all chances  
	    
	    // probability of an attack winning without defense is 90%
	    
	    scores.readFile();
	    
	    List<String> d_choices = new ArrayList<String>();
	    List<String> a_choices = new ArrayList<String>();

	    // repeats for 7 days (currently 1)
	    while (input < 7) {
	    	
	    	// prints out the statistics
	    	System.out.println("Defender Score: " + d_score);
	    	System.out.println("Defender Points Left: " + d_points);
	    	
	    	System.out.println("Attacker Score: " + a_score);
	    	System.out.println("Attacker Points Left: " + a_points);
	    	
	    	
	    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	    	System.out.println(defences);
	    	System.out.println("Defender's move: (enter number of desired defence)");
		    String defenders_input = String.valueOf(checkValidIntegerEntry(in)); //Waits for input
		    d_choices.add(defenders_input);
		    d_points -= 10;
		    
		    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	    	System.out.println(attacks);
		    System.out.println("Attacker's move: (enter number of desired attack)");
		    String attacker_input = String.valueOf(checkValidIntegerEntry(in)); //Waits for input
			a_choices.add(attacker_input);
		    a_points -= 10;
		    
		    if (d_choices.contains(attacker_input) == true){
		    	System.out.println("Failed attack; defenders win");
		    	d_score += 1;
		    	
		    	
		    }else { // no defense in place
		    	int rand_int1 = rand.nextInt(100);
		    	if (rand_int1 <= 95) {
		    		System.out.println("Attackers win this day");
		    		a_score += 1;
		    		
		    	}else {
		    		System.out.println("Failed attack; defenders win");
			    	d_score += 1;
		    	}
		    }
			
		    input += 1;
	    }
		String outputString = "Defender Score: " + d_score + "\n" +
						"Defender Points Left: " + d_points + "\n" +
						"\nAttacker Score: " + a_score + "\n" +
						"Attacker Points Left: " + a_points + "\n\n";
    	
    	if (d_score > a_score) {
			outputString += "Defenders win because they had more points\n\n";
    	} else {
			outputString += "Attackers win because they had more points\n\n";    	
		}
		System.out.println(outputString);

		scores.writeFile(outputString);
	}
}