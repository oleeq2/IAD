import java.util.Calendar;
public class Hello {
		
	private PartOfDay getTime()
	{
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		PartOfDay ret;
		
		if( 7 >= hour )
			ret = PartOfDay.NIGHT;
		else if( 8 <= hour && 11 > hour )
			ret = PartOfDay.MORNING;
		else if( 12 <= hour && 13 > hour)
			ret = PartOfDay.LUNCHTIME;
		else if( 11 <= hour && 18 > hour)
			ret = PartOfDay.DAYTIME;
		else 
			ret = PartOfDay.EVENING;
	
		return ret;
	}
	
	public void Say()
	{
		String text;
		switch(getTime())
		{
		case DAYTIME:
			text = "Добрый день";
			break;
		case EVENING:
			text = "Добрый вечер";
			break;
		case LUNCHTIME:
			text = "Вы что не видите!? У нас обед!";
			break;
		case MORNING:
			text = "Доброе утро";
			break;
		case NIGHT:
			text = "По ночам спать нужно =\\";
			break;
		default:
			text = "";
			break;
			
		}
		
		System.out.println(text);
	}
	
	public static void main(String[] args){
		Hello myObj = new Hello();
		myObj.Say();
	}
}
