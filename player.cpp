#include <iostream>

using namespace std;

#include "player.hpp"

Player::Player(String name_, String sName_, String thName_, int yOfBirth, int fRating)
{
  name = name_;
  secondName = sName_;
  thirdName = thName_;
  yearOfBirthday = yOfBirth;
  fideRating = fRating;
  points = 0;
  additionalPoints = 0;
}
Player::game(double res, player op)
{
  opponents.pushFront(op);
  points += double; 
}
Player::printInfo()
{
cout << name << " " << secondName << " " << points << endl;
}
