int score_player_one = 0
int score_player_two = 0
int score_difference = 0
String weapon_one, weapon_two
println ">> Rock, Paper or Scissors <<" 
while (score_difference > -3 && score_difference < 3) {
	while (s != "RR" || s != "PP" || s != "SS" || s != "PR" || s != "SP" || s != "RS" || s != "RP" || s != "PS" || s != "SR") {
		println "Input an option for the two players chosen weapon (RR, PP, SS, PR, SP, RS, RP, PS or SR): "
		String s = System.console().readLine()
	}
	weapon_one = s.substring(0,1)
	weapon_two = s.substring(1,2)
	if (weapon_one == weapon_two) {
		println "Draw, no score"
	} else if (s == "PR" || s == "SP" || s == "RS") {
		score_player_one = score_player_one + 1		
	} else if (s == "RP" || s == "PS" || s == "SR") {
		score_player_two = score_player_two + 1
	}
	println "Score >> Player1: " + score_player_one + "  vs Player2: " + score_player_two
	score_difference = score_player_one - score_player_two
}
println "---"
println "FINAL SCORE"
println "Player 1: " + score_player_one
println "Player 2: " + score_player_two
println "---"
if (score_player_one > score_player_two) {
	println "Player 1 wins!"
} else {
	println "Player 2 wins!"
}