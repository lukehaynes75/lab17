package lab17;

public class Country {

		private String Country;
		private int pop;
		
		public Country(String Country, int pop) {
			this.Country = Country;
			this.pop = pop;
		}
		
		@Override
		public String toString() {
			return "Country Country = " + Country + ", pop = " + pop;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public int getPop() {
			return pop;
		}
		public void setPop(int pop) {
			this.pop = pop;
		}
		
}
