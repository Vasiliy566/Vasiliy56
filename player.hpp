#include <list>
#include <string>
class Player
{
    // Add national rating, national league, 
    //groups where want to get the prize
  private:
    String 
       name,
       secondName,  // second name
       thirdName;   // third name
    int yearOfBirthday; // !!update with full data
    int fideRating;
  public:
    double points;                                // points that player get
    double additionalOpints;                      // additional points that shoul use when two or more players have same points
    list<Player> opponents;                    //list of players that thi player played with
    Player(String, String, String, int, int);
    game (double result, player opponent);
    printInfo();	
}
