namespace input-csharp{

  public class User{
    public int Id { get; set; }

    public string Name { get; set; }

    public string Email { get; set; }

    public string Password { get; set; }

    public List<UserContact> Contacts { get; set; }

    public User()
    {

    }

    public User(string name, string email, string password){
      Name = name;
      Email = email;
      Password = password;
    }

    public User(string name, string email, string password, List<UserContact> contacts){
          Name = name;
          Email = email;
          Password = password;
          Contacts = contacts;
    }
  }
}