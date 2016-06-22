namespace input-csharp{

    public class UserContact{

    public int Id { get; set; }

    public string ContactName { get; set; }

    public string ContactInfo { get; set; }

    public string Description { get; set; }

    public UserContact(string contactName, string contactInfo, string description){
      ContactName = contactName;
      ContactInfo = contactInfo;
      Description = description;
    }
  }
}