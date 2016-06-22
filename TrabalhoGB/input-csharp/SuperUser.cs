namespace input-csharp{

	public class SuperUser : User {

		public string SuperUserLogin { get; set; }

		public SuperUser(string superUserLogin)
		{
			SuperUserLogin = superUserLogin;
		}
	}
}