
public class Billfold
{

    static Card card1;
    static Card card2;
    
    public static void addCard(Card new_card)
    {
        if(card1 == null)
        {
            card1 = new_card;
        }
        else if(card2 == null)
        {
            card2 = new_card;
        }
    }
    
    public String formatCards()
    {
        String str = "";
        
        if(card1 != null)
        {
            str += card1.format();
        }
        else if(card2 != null)
        {
            str += card2.format();
        }
        
        return str;
    }



}
