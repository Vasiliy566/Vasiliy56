#include <list>
#include <string>

#include "player.hpp"
class CircleTour
{
  private:
    string
      name,
      place,
      description;
  int tours;
  public:
    CircleTour(string, string, string, int);
    void addPlayer(Player p);
    list<Player> players;
    void printPairs();
   //list<Player, Player> pairs;
};
