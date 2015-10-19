String store_rank, store_suit, suit1, suit2, suit3, suit4, suit5
String poker_hand = "Nothing"
int rank1, rank2, rank3, rank4, rank5, order1, order2, order3, order4, order5
int card_number = 0
boolean break_loop = false
while (!break_loop) {
	if (card_number != 5) {
		print "Please enter the card rank (1-10, J, Q or K): "
		store_rank = System.console().readLine()
			while (store_rank != "1" && store_rank != "2" && store_rank != "3" && store_rank != "4" && store_rank != "5" && store_rank != "6" && store_rank != "7" && store_rank != "8" && store_rank != "9" && store_rank != "10" && store_rank != "J" && store_rank != "Q" && store_rank != "K") {
				print "Oh, that is not a valid rank. Please try again: "
				store_rank = System.console().readLine()
			}
			if (store_rank == "J") {
				store_rank = "11"
			} else if (store_rank == "Q") {
				store_rank = "12"
			} else if (store_rank == "K") {
				store_rank = "13"
			}
			print "Please enter suit (spades, diamonds, clubs, or hearts): "
			store_suit = System.console().readLine()
			while (store_suit != "spades" && store_suit != "diamonds" && store_suit != "clubs" && store_suit != "hearts") {
				print "Oh, that is not a valid suit. Please try again: "
				store_suit = System.console().readLine()
			}
	}
}