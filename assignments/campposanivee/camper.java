/** @author Adam Kessler */
public class camper implements Comparable {
    String name;
    int age;
    char sex;
	/** compare two objects
		@param obj object to compare
	*/
	public int compareTo(Object obj) {
		if (obj instanceof camper) {
			camper c = (camper) obj;
			return this.name.compareTo(c.name);
		}
		else
			return -1;
	}
}
