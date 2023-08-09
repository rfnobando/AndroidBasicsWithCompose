// Defining the 'Bid' class to represent bids made by bidders.
class Bid(val amount: Int, val bidder: String)

// Function to determine the final price for an auctioned item.
// If a bid is provided, return the bid amount; otherwise, return the minimum price.
fun auctionPrice(bid: Bid?, minimumPrice: Int) = when {
    bid != null -> bid.amount
    else -> minimumPrice
}

// Main function to execute the program
fun main() {
    // Defining Bid objects for different auctioned items
    val winningBidItemA = Bid(5000, "Private Collector")
    val winningBidItemD = Bid(9000, "Private Collector")

    // Output the results of the auction for different items
    println("Item A is sold at ${auctionPrice(winningBidItemA, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
    println("Item C is sold at ${auctionPrice(null, 10000)}.")
    println("Item D is sold at ${auctionPrice(winningBidItemD, 4000)}.")
}
