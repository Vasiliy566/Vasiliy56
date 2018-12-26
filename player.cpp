#include <iostream>
#include <string>
using namespace std;

#include "player.hpp"

Player::Player(string name_, string sName_, string thName_, int yOfBirth, int fRating)
{
  name = name_;
  secondName = sName_;
  thirdName = thName_;
  yearOfBirthday = yOfBirth;
  fideRating = fRating;
  points = 0;
  additionalPoints = 0;
}
void Player::game(double res, Player op)
{
  opponents.push_front(op);
  points += res; 
}
void Player::printInfo()
{
  cout << name << " " << secondName << " " << points << endl;
}
