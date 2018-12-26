#include <list>
#include <string>

using namespace std;

#include "circleTour.hpp"
int main()
{
Player testPlayer ("Vasily", "Isaev", "Sergeevich", 1999 , 2060);
testPlayer.printInfo();
Player testPlayer2 ("Shapiev", "Timur", "AAA", 1999, 2000);

CircleTour tournament ("Saint-Petersburg open", " SPB ", "test description", 9);
tournament.addPlayer(testPlayer);
tournament.addPlayer(testPlayer2);
tournament.printPairs();
return 0;
}
