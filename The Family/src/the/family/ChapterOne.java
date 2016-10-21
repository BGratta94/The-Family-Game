package the.family;


import java.awt.Color;
import java.util.Random;
import the.family.StoryBoard;


/**
 *
 * @author Brandon
 */
public class ChapterOne extends Thread
{
    MusicPlayer p,p2,p3,p4;
    private static Random r;
    private static int n;
    public static boolean nextPressed;
    public static boolean invOpened;
    public static boolean gamePassed;
    public static boolean gameRunning;
    public ChapterOne()
    {
       p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Crowd Ambience.mp3");
       r = new Random();
       n = 0;
       gamePassed = false;
       nextPressed = false;
       gameRunning = false;
    }
    
    public void run()
    {
       //introOne();
       //introTwo();
       //introThree();
       //carRide();
       //introFour();
    }
    
    private static void next()
    {
        StoryBoard.next.setEnabled(true);
        nextPressed = false;
        while(!nextPressed)
        {
            sleep(100);
        }
        nextPressed = false;
    }
    
    private static void write(String sentence)
    {
        for(int i=0; i<sentence.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(sentence.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("\n");
        sleep(300);
    }
    
    private static void writeWW(String speaker, String sentence, int seconds)
    {
       for(int i=0; i<speaker.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(speaker.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("   ");
        sleep(500);
        for(int i=0; i<sentence.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(sentence.charAt(i)));
                if(sentence.charAt(i) == '.')
                {
                    sleep(800);
                }
                else if(sentence.charAt(i) == ',')
                {
                    sleep(800);
                }
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("\n");
        sleep(seconds * 1000); 
    }
    
    private static void write(String speaker, String sentence)
    {
        
        for(int i=0; i<speaker.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(speaker.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("   ");
        sleep(500);
        for(int i=0; i<sentence.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(sentence.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("\n");
        sleep(300);
    }
    
    private static void write(String speaker, String sentence,int seconds)
    {
        for(int i=0; i<speaker.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(speaker.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("   ");
        sleep(500);
        for(int i=0; i<sentence.length(); i++)
        {
            try
            {
                Thread.sleep(50);
                StoryBoard.board.append(Character.toString(sentence.charAt(i)));
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
        StoryBoard.board.append("\n");
        sleep(seconds * 1000);
    }
    
    private static void sleep(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            
        }
    }
    
    private static void clear()
    {
        StoryBoard.board.setText("");
    }
    
    private static void readyYesNo()
    {
        StoryBoard.yes.setEnabled(true);
        StoryBoard.no.setEnabled(true);
        StoryBoard.choosing = true;
        while(StoryBoard.choosing == true)
        {
            sleep(100);
        }
    }
    
    private static void playHandgunShots()
    {
        MusicPlayer mp,mp1,mp2,mp3;
        mp = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\handgunShot.mp3");
        mp2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\handgunShot.mp3");
        mp1 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\handgunShot.mp3");
        mp3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodRicochet.mp3");
        mp.start();
        sleep(600);
        mp2.start();
        n = r.nextInt(4);
        if(n == 1)
        {
          sleep(100);
          mp3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodRicochet.mp3");
          mp3.start();  
        } 
        sleep(350);
        mp1.start(); 
    }
    
    private static void playShotgun(boolean glassShatter)
    {
        MusicPlayer mp,mp1,mp2;
        mp = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\shotgun.mp3");
        mp1 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\shotgunCock.mp3");
        mp2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\bottleSmash.mp3");
        if(glassShatter)
        {
            mp.start();
            mp2.start();
            sleep(1300);
            mp1.start();
        }
        else
        {
            mp.start();
            sleep(1300);
            mp1.start();
        }
        
    }
    
    public void introOne()
    {
        write("","Detective Leo Roman and Clayton Harris are both coming off of the successful investigation and killing of dangerous serial murderer Jerry 'freakshow' Klem.",1);
        write("","What was one of the hardest cases your department has ever seen was just another day at the office for the two top notch detectives.",1);
        write("","Your hard work never goes unnoticed. The department decides to have a little celebration for you two.",1);
        write("\n");
        write("press Next to continue...");
        next();
        write("","                                                         Chapter One",3);
        clear();
        p.start();
        sleep(1000);
        write("Co-Worker:", "Would you like a slice of cake detective?");
        readyYesNo();
        if(StoryBoard.choice == 2)
        {
            write("You:", "Sure I'll take one.");
            write("Co-Worker:" , "Coming right up!",1);
            write("You:" ,"Thanks.");
            write("\n");
            write("She hands you a slice with chocolate filling, your favorite.");
            write("\n");
            write("Co-Worker:","Here you go! don't eat it too fast your eyes are popping out of your head already.",1);
            write("\n");
            write("She laughs as she moves along.");
            sleep(2000);
            next();
        }
        else if(StoryBoard.choice == 5)
        {
            write("You:","No thanks.");
            write("Co-Worker:" ,"No slice of your own celebration cake? You feeling okay?");
            write("You:" ,"Yeah, just not hungry is all.");
            write("Co-Worker: cake don't taste the same when you get it all the time anyway.");
            write("\n");
            write("She laughs as she moves along.");
            sleep(2000);
            next(); 
        }
            write("","You step outside your office to join the rest of the department and notice a large crowd of officers surrounding Clayton.",2);
            write("\n");
            write("","You decide to walk over to see what he has everyone so intrigued by.",1);
            write("","As you get closer, you realize he's telling the story of how you took down freakshow.",1);
            next();
            write("Clayton:","This bastard was standing 6'3 or some shit. He was looking down at us while we were the ones trying to be intimidating. And...",1);
            write("Clayton:","Yo Roman!",1);
            write("Clayton:","Come tell the the guys how we did Klem in.",1);
            write("\n");
            write("","You walk over and decide to treat them to the story",2);
            write("\n");
            write("You:","Okay boys, so we get to the door...");
            next();
            p.close();
        }
    
    public void introTwo()
    {
      p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Rain Ambience.mp3");
      p2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Stone Steps.mp3");
      p3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Knock.mp3");
      p4 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\doorOne.mp3");
      p.start();
      write("","                                                  Freakshow's House",3);
      clear();
      p2.start();
      write("Clayton:","This is the address, right?",1);
      write("You:","Yeah it is. Go ahead and knock.",1);
      p2.close();
      p3.start();
      write("Clayton:","Watch this dude not even be here..",1);
      write("You:","Be patient.",0);
      p3.close();
      p4.start();
      sleep(2000);
      write("Klem:","Yes?",2);
      write("\n");
      write("You show your badges to Jerry");
      write("\n");
      write("You:","Mr.Klem we have some questions we need to ask, but it's pouring. Mind if we come in?",1);
      write("Klem:","No, not at all. Please come on in.",2);
      p4.close();
      next();
      p.close();
      p3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodenDoorClose.mp3");
      p3.start();
      sleep(2000);
      p3.close();
      p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodenStepsOne.mp3");
      p.start();
      p2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodenStepsTwo.mp3");
      p2.start();
      write("Klem:","Please, sit down.",1);
      sleep(2000);
      write("Clayton:","Thanks, bud.",1);
      p2.close();
      p2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodenStepsOne.mp3");
      p.close();
      p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\teaKettle.mp3");
      p.start();
      write("You:","Look, I wanna make this quick. We...",1);
      write("Klem:","My kettle!",0);
      write("Klem:","I'm sorry just a moment I have to get my tea.",1);
      p2.start();
      write("\n");
      write("Klem runs off to the kitchen.");
      write("\n");
      p2.close();
      write("You:","What in the...",0);
      write("Clayton:","Fuck it, let him have his last drink as a free man yeah?",1);
      write("\n He chuckles.");
      next();
      p.close();
      p2.close();
      write("","You two wait as you hear Mr.Klem rustling all around the kitchen.",2);
      write("\n");
      write("You:","Take a quick look around the room while he's busy.",1);
      write("Clayton:","Ok sure.",1);
      write("Clayton:","No. You do it. I'm not getting caught looking.",0);
      write("You:","Just do it and stop complaining.",1);
      write("Clayton:","Fine. Where should I look?",1);
      int searchedRoom = 0;
      boolean one = false,three = false ,four = false;
      boolean shellsFound = false;
      while(searchedRoom != 2 && shellsFound == false)
      {
          if(!one)
          {
              StoryBoard.choiceOne.setText("bookshelf");
              StoryBoard.choiceOne.setEnabled(true);
          }
          if(!three)
          {
              StoryBoard.choiceTwo.setText("desk");
              StoryBoard.choiceTwo.setEnabled(true);  
          }
          if(!four)
          {
              StoryBoard.choiceThree.setText("closet");
              StoryBoard.choiceThree.setEnabled(true); 
          } 
          
          StoryBoard.choosing = true;
          while(StoryBoard.choosing)
          {
              sleep(100);
          }
          if(StoryBoard.choice == 1)
          {
              one = true;
              clear();
              write("You:","Check the bookshelf out.",1);
              write("Clayton:","Okay.",1);
              write("\n");
              write("","Clayton rummages through the shelf...",2);
              write("\n");
              write("Clayton:","Oh shit.",1);
              write("Clayton:","There's a pack of shotgun shells here",0);
              write("You:","You'd never get a license for that around here.",0);
              write("Clayton:","That's what I'm saying. We need to go get him ASAP.",2);
              shellsFound = true;
              next();
          }
          else if(StoryBoard.choice == 3)
          {
              three = true;
              clear();
              write("You:","Check the desk out.",1);
              write("Clayton:","Alright.",1);
              write("\n");
              write("","Clayton looks through the contents of the desk, but finds nothing.",1);
              write("\n");
              write("Clayton:","Nothing of any use here man. Where else?",3);
              searchedRoom++;
          }
          else if(StoryBoard.choice == 4)
          {
              four = true;
              clear();
              write("You:","Check the closet out.",1);
              write("Clayton:","Checking.",1);
              write("\n");
              write("","Clayton searches throughout the closet, but doesn't find anything.",1);
              write("\n");
              write("Clayton:","Nope, nothing here man. It checks out alright.",2);
              write("Clayton:","Where else should I look?",3);
              searchedRoom++;
          }
      }
      clear();
      if(shellsFound == true)
      {
          write("You:","Mr.Klem? You still in the kitchen?");
          write("You:","I'm coming to you now.",2);
          write("\n");
          write("","You unholster your gun and slowly begin your move to the kitchen.",1);
          p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\loadHandgun.mp3");
          p.start();
          write("\n");
          write("Clayton:","Be careful man.",0);
          write("You:","I got it.",1);
          write("\n");
          write("","You hear footsteps bolt out the other end of the kitchen.",1);
          write("","You move up to the doorway quickly, and turn the corner.",2);
          write("","A cup falling gets your attention.",1);
          next();
          write("","You turn toward the cup to see Mr.Klem standing with a shotgun in hand",1);
          p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\scaryViolin.mp3");
          p.start();
          write("","Your gun is already drawn thanks to Clayton finding the shells, and so you're the first to fire.",1);
          playHandgunShots();
          write("\n");
          write("Klem:","AGHH!",1);
          write("\n");
          write("","A bullet hits Jerry in his arm. He runs out the back door to find cover.",2);
          write("\n");
          write("You:","Clayton, go after him. I'm gonna run upstairs and try to get an angle on him.",0);
          write("Clayton:","Okay!",0);
          write("Clayton:","You better not miss.",1);
          next();
          p.close();
          p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Rain Ambience.mp3");
          p.start();
          write("","You run upstairs and get into position. A bedroom with a small window facing the yard.",2);
          write("","As you stay hidden, you see Clayton move into position.",2);
          write("\n");
          write("Clayton:","Look, it doesn't have to end this way man. No one has to die here.",1);
          write("Klem:","FUCK OFF!",0);
          write("\n");
          write("","Klem pops out from behind his shed and fires at Clayton.",1);
          playShotgun(true);
          write("","He misses and hits a window of the house instead",2);
          write("\n");
          write("Klem:","You're the one who's a dead man!",1);
          next();
          playShotgun(false);
          write("","Jerry quickly switches cover, but Clayton is hiding and doesn't notice.",2);
          write("","Clayton pops out to fire a shot",1);
          write("","Jerry steps out from the side and has a clear shot on Clayton",2);
          write("","You take a deep breath, remember your training, and take aim at Jerry",2);
          next();
          gameRunning = true;
          ShootGame sg = new ShootGame();
          sg.runShootGame(20);
          while(gameRunning)
          {
              sleep(100);
          }
          if(gamePassed == true)
          {
             write("","You fire, hitting Klem with every shot.",1);
             playHandgunShots();
             write("","Klem's body drops to the floor, instantly lifeless.",1);
             write("\n");
             write("Clayton:",".... I...",0);
             write("You:","I know, but you're alright. Let's call in and get all this taken care of shall we?",2);
             next();
             p.close();
          }
          else
          {
             write("","You panic and fire, missing Klem with every shot.",1);
             playHandgunShots();
             write("","Klem turns up to you, shotgun cocked and ready to fire.",1);
             write("","Clayton quickly fires at Klem, hitting him multiple times in the back and dropping him.",2);
             playHandgunShots();
             write("","Klem's body drops to the floor, instantly lifeless.",1);
             write("\n");
             write("You:",".... I...",0);
             write("Clayton:","MISSED. Yeah you kinda did.",2);
             write("Clayton:","I'm alright man, but shit he could've got me there.",1);
             write("Clayton:","Anyways, let's just make the calls and get this taken care of.",1);
             next();
             p.close(); 
          }
          
      }
      else if(searchedRoom == 2)
      {
         write("You:","I think I hear him coming back sit down!",0);
         write("Clayton:","Shit!",0);
         write("\n");
         write("","Clayton rushes and manages to get back to his seat before Klem returns.",2);
         write("\n");
         write("Klem:","Ahh all taken care of I'm terribly sorry about that.",1);
         write("You:","No problem. What I wanted to talk to you about was...",1);
         write("\n");
         write("You turn to Mr.Klem, who is now holding a shotgun in his hands");
         next();
         p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\scaryViolin.mp3");
         p.start();
         write("Klem:","And to think I thought you two were going to be friendly!",0);
         write("Clayton:","Woah woah put the gun down man!",0);
         write("Klem:","SHUT THE FUCK UP!",0);
         write("\n");
         write("","Jerry aims the gun at Clayton.",2);
         write("Clayton:","We just had a few questions!",1);
         write("You:","Don't do this Jerry!",0);
         write("\n");
         write("","As Jerry aims at Clayton, you manage to unholster your gun.",1);
         write("","You aim your gun, Jerry sees it and turns to you, quickly firing off a shot.",1);
         playShotgun(true);
         write("","You dive out of the way, the shells narrowly missing you, and fire off a couple shots back.",0);
         playHandgunShots();
         sleep(2000);
         clear();
         write("\n");
         write("Klem:","AGHH!",1);
         write("\n");
         write("","A bullet hits Jerry in his arm. He runs out the back door to find cover.",2);
         write("\n");
         write("You:","Clayton, go after him. I'm gonna run upstairs and try to get an angle on him.",0);
         write("Clayton:","Okay!",0);
         write("Clayton:","You better not miss.",1);
         next();
          p.close();
          p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Rain Ambience.mp3");
          p.start();
          write("","You run upstairs and get into position. A bedroom with a small window facing the yard.",2);
          write("","As you stay hidden, you see Clayton move into position.",2);
          write("\n");
          write("Clayton:","Look, it doesn't have to end this way man. No one has to die here.",1);
          write("Klem:","FUCK OFF!",0);
          write("\n");
          write("","Klem pops out from behind his shed and fires at Clayton.",1);
          playShotgun(true);
          write("","He misses and hits a window of the house instead",2);
          write("\n");
          write("Klem:","You're the one who's a dead man!",1);
          next();
          playShotgun(false);
          write("","Jerry quickly switches cover, but Clayton is hiding and doesn't notice.",2);
          write("","Clayton pops out to fire a shot",1);
          write("","Jerry steps out from the side and has a clear shot on Clayton",2);
          write("","You take a deep breath, remember your training, and take aim at Jerry",2);
          next();
          gameRunning = true;
          ShootGame sg = new ShootGame();
          sg.runShootGame(20);
          while(gameRunning)
          {
              sleep(100);
          }
          if(gamePassed == true)
          {
             write("","You fire, hitting Klem with every shot.",1);
             playHandgunShots();
             write("","Klem's body drops to the floor, instantly lifeless.",1);
             write("\n");
             write("Clayton:",".... I...",0);
             write("You:","I know, but you're alright. Let's call in and get all this taken care of shall we?",2);
             next();
             p.close();
          }
          else
          {
             write("","You panic and fire, missing Klem with every shot.",1);
             playHandgunShots();
             write("","Klem turns up to you, shotgun cocked and ready to fire.",1);
             write("","Clayton quickly fires at Klem, hitting him multiple times in the back and dropping him.",2);
             playHandgunShots();
             write("","Klem's body drops to the floor, instantly lifeless.",1);
             write("\n");
             write("You:",".... I...",0);
             write("Clayton:","MISSED. Yeah you kinda did.",2);
             write("Clayton:","I'm alright man, but shit he could've got me there.",1);
             write("Clayton:","Anyways, let's just make the calls and get this taken care of.",1);
             next();
             p.close(); 
          }
      }
    }
    
    public void introThree()
    {
        p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Crowd Ambience.mp3");
        p2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\silentNightAmbience.mp3");
        p3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\phoneRing.mp3");
        p.start();
        write("","The officers stand in shock at what they just heard",2);
        write("\n");
        if(gamePassed = true)
        {
            write("Officer:","Wow, so you saved your partner's life out there. You two are lucky to have eachother",1);
            write("Clayton:","Yeah, really. I owe this man right here a lot.",1);
            write("You:","You don't owe me a thing Clay, just take the beer tab next time we're out.",1);
        }
        else
        {
           write("Officer:","Wow, so your partner saved your life out there. You two are lucky to have eachother",1); 
           write("You:","I don't know what I would do without him.",1);
           write("Clayton:","You'd be on the floor with five shots in your ass that's what.",1);
        }
        write("Capt. Kavanagh:","Alright everyone, we aren't off all day. There's people that need us.",2);
        write("\n");
        write("","The rest of the day goes easy. You finish up your shift and head home",2);
        p.close();
        write("","Your bed is pleasant and within minutes you find yourself dozing off...",3);
        next();
        p2.start();
        write("","                                                            2:45AM",3);
        clear();
        p3.start();
        sleep(3500);
        p3.close();
        sleep(500);
        write("You:","Hello?",1);
        write("Capt. Kavanagh:","Sorry to bother you this late.",0);
        write("Capt. Kavanagh:","Something important came up.",0);
        write("You:","Wait what? What happened?",1);
        write("Capt. Kavanagh:","It's a lot to explain right now.",0);
        write("Capt. Kavanagh:","I need you and Clayton in tomorrow as early as possible can you do that?",1);
        write("You:","Yeah, not a problem. I'll tell him now.",1);
        write("\n");
        write("","You reach out to Clayton, who answers. He'll be there tomorrow",2);
        next();
        p2.close();
        p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\Crowd Ambience.mp3");
        p.start();
        sleep(2500);
        write("Clayton:","You have any idea what this is about?",0);
        write("You:","Not a clue.",0);
        sleep(2000);
        write("\n");
        write("Capt. Kavanagh:","Gentleman, inside my office now please.",2);
        next();
        p.close();
        p3 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\woodenDoorClose.mp3");
        p3.start();
        sleep(2000);
        write("Capt. Kavanagh:","We have ourselves a situation boys.",1);
        write("\n");
        write("","Kavanagh places a photo of a young girl on the desk",2);
        write("\n");
        write("Capt. Kavanagh:","This is Anna Bellamie. 17 years old.",0);
        write("Capt. Kavanagh:","She's been missing for 3 days now.",1);
        write("Clayton:","Any possible motive to run away?",1);
        write("Capt. Kavanagh:","Negative. All evidence so far suggests she was just a smart, family loving girl.",1);
        write("You:","You know more than we do at the moment sir, What do you think it is?",2);
        write("Capt. Kavanagh:","....",2);
        write("Capt. Kavanagh:","Kidnapping...",2);
        next();
        write("You:","Do we have evidence?",1);
        write("Capt. Kavanagh:","The last she's been seen was on tape in front of a store by her house.",1);
        write("Capt. Kavanagh:","She can be seen talking to and helping an older man.",1);
        write("Capt. Kavanagh:","A man that's been identified and had a couple strange run-ins with the law",2);
        write("Capt. Kavanagh:","Mr. Weiss has had cops called multiple times because of his strange behavior in the streets.",1);
        write("Capt. Kavanagh:","First time he was searched, he had paraphernalia, and was put away for a few months.",1);
        write("Capt. Kavanagh:","Second time, he had the head of a chicken, a vial of, what he claimed, was frog's blood, and a small, legal, blade.",2);
        write("Capt. Kavanagh:","Officers also made note that he seemed a bit delusional, or not present, when they were talking to him.",2);
        next();
        write("Capt. Kavanagh:","But why would he have these items?",2);
        write("Clayton:","Doubt he's just trying to cook up a nice dish..",1);
        write("You:","Rituals?",1);
        write("Clayton:","What now?",0);
        write("You:","Rituals.",1);
        write("You:","Not too sure about the last two items, but severed chicken heads are common items found around sites of supposed demonic rituals or sacrifices",2);
        write("Capt. Kavanagh:","I mean, there's definitely the possibility of that.",1);
        write("Capt. Kavanagh:","There's only one way to find out for sure. That's where you two come in.",1);
        write("Capt. Kavanagh:","I need you two to pay this man a visit.",2);
        next();
        write("Clayton:","Where exactly are we going?",1);
        write("Capt. Kavanagh:","He lives with some family away in the Norwood Estate.",0);
        write("Clayton:","That tattered old mansion outside the city? That's where he lives?",0);
        write("You:","Why am I not surprised?",2);
        write("Capt. Kavanagh:","Look, we need to find that girl",0);
        write("Capt. Kavanagh:","I know it's not exactly approved, but after, do some snooping around the premises if you can.",1);
        write("Capt. Kavanagh:","We need to find more evidence as to where this girl is.",1);
        write("Capt. Kavanagh:","Remember, he was noted as unstable, tread lightly",1);
        write("Capt. Kavanagh:","Try to question the family a bit early, and head back at night to investigate the exterior.",1);
        write("Capt. Kavanagh:","Do not hesistate to radio in should you find anything to be off.",2);
        write("You:","Will do.",0);
        write("Clayton:","Will do.",0);
        next();
    }
    
    public void carRide()
    {
        p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\rainyDrive.mp3");
        p.start();
        sleep(2000);
        write("","                                           The Road to Norwood Estate",3);
        sleep(2000);
        clear();
        writeWW("","The rain is light, and you've been on the road for over an hour",1);
        writeWW("","Finally getting close to the destination, you two begin to wonder what to expect",1);
        writeWW("","Norwood Estate is a huge ground, surrounded by dozens of acres of forest",1);
        writeWW("","It's fully possible there could be clues somewhere within",1);
        writeWW("","If not within there, then within the mansion itself, one of the largest and oldest this side of the US",1);
        write("","How could a crazed man like that live somewhere like this?",1);
        next();
        sleep(2500);
        write("Clayton:","Think this guy is gonna give us trouble?",1);
        if(gamePassed)
        {
           writeWW("You:","I don't know. He is an older man. I'm not worried.",1);
           write("Clayton:","Yeah, He is. So was Klem...",1);
        }
        else
        {
            writeWW("You:","He's old, but Klem was too, we can't know for sure.",1);
            write("Clayton:","You go after him this time if the guy runs.",1);
        }
        write("You:","I have a feeling about all this...",1);
        write("Clayton:","What do you mean?",1);
        writeWW("You:","I don't know.. I mean, what if I'm right about the rituals?",1);
        writeWW("Clayton:","Well then... we'll just have to be extra careful.",1);
        write("Clayton:","Always be aware of what's around us you know?",1);
        writeWW("You:","Yeah, I guess.",2);
        next();
        sleep(3000);
        writeWW("Clayton:","Look man, I know I've said it before",1);
        writeWW("Clayton:","But, I wouldn't want another partner by my side",1);
        writeWW("Clayton:","Really, You've saved my ass more times than I can count.",1);
        writeWW("You:","It's nothing Clay, really",1);
        writeWW("You:","You've done the same for me. We're in this thing together.",2);
        write("\n");
        write("Clayton:","GPS says we're about 5 minutes out. You ready?",2);
        readyYesNo();
        if(StoryBoard.choice == 2)
        {
            writeWW("You:","We've seen it all by now haven't we? We got this.",2);
            write("Clayton:","Damn right about that.",1);
        }
        else if(StoryBoard.choice == 5)
        {
            writeWW("You:","I mean... I sure hope so..",2);
            writeWW("Clayton:","Yeah... I hope so too bud.",1);
        }
        next();
        p.close();
        write("","You have completed the game tutorial.",1);
        write("\n");
        writeWW("","From here on out, you will be exposed to choices and mini games of varying difficulties. All of which can play a role in the survival of you and your partner.",2);
        writeWW("","While not every decision will be life or death, they can cause snowball effects and impact future outcomes.",2);
        write("\n");
        writeWW("","If your partner dies, the game will continue. However, if you happen to die, the game will end",1);
        writeWW("","Make every choice as though it may be your last... It might very well be..",1);
        writeWW("","Press Next to continue...",1);
        next();
        write("Would you like to save your progress before beginning the main game?");
        write("\n");
        write("(you will be able to save at the start of each chapter section)");
        readyYesNo();
        if(StoryBoard.choice == 2) //yes, save game
        {
            
        }
    }
    
    public void introFour()
    {
        clear();
        sleep(2000);
        invOpened = false;
        write("You arrive at the Estate");
        write("\n");
        p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\carDoorClose.mp3");
        p.start();
        sleep(600);
        p2 = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\carDoorClose.mp3");
        p2.start();
        write("Clayton:","Make sure you take your gun out of the dashboard.",1);
        write("You:","Oh yeah, I almost forgot.",1);
        write("\n");
        write("Click on the inventory button to pull up your inventory");
        while(invOpened == false)
        {
           sleep(100); 
        }
        write("\n");
        write("You:","Got it. I'm ready to go.",1);
        write("Clayton:","Let's do this thing.",2);
        next();
    }
}



/*  CODE FOR SETTING UP PLAYER CHOICE


write("Co-Worker: Would you like a slice of cake detective?");
       StoryBoard.yes.setEnabled(true);
       StoryBoard.no.setEnabled(true);
       StoryBoard.choosing = true;
       while(StoryBoard.choosing == true)
       {
           sleep(100);
       }
       if(StoryBoard.choice == 2)
       {
           write("You: Sure I'll take one.");
           write("Co-Worker: Coming right up!");
       }
       else if(StoryBoard.choice == 5)
       {
           write("You: No thanks.");
           write("Co-Worker: No slice of your own celebration cake? You feeling okay?");
           write("You: Yeah, just not hungry is all.");
           
       }

*/