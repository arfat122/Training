def win(player_One,player_Two):
    if (player_One == 'rock' and player_Two == 'paper'):
        print("Player_Two is the winner!!!")
    elif (player_One == 'paper' and player_Two == 'rock'):
        print("Player_One is the Winner!!!")
    elif (player_One == 'paper' and player_Two == 'scissors'):
        print("Player_Two is the Winner")
    elif (player_One == 'scissors' and player_Two == 'paper'):
        print("Player_One is the Winner!!!")
    elif (player_One == 'rock' and player_Two == 'scissors'):
        print("Player_One is the Winner!!!")
    elif (player_One == 'scissors' and player_Two == 'rock'):
        print("Player_Two is the Winner!!!")
    elif (player_One == player_Two):
        print("TIE!!!")

while True:
    player_One=input("Enter your Player_One choice: ")
    player_Two = input("Enter your Player_Two choice: ")
    win(player_One,player_Two)
    print("Do you want to continue (Y/N): ")
    ans = input()
    if ans == "n" and ans == "N":
        break
