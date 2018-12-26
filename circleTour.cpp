#include <iostream>
#include <string>

using namespace std;

#include "circleTour.hpp"

CircleTour::CircleTour(string name_, string place_, string description_, int tours_)
{
  name = name_;
  place = place_;
  description = description_;
  tours = tours_; 
}
void CircleTour::addPlayer(Player p)
{
  players.push_back(p);  
}
void CircleTour::printPairs()
{
 players.front().printInfo();
cout << " with "<< endl;
 players.back().printInfo();
}
