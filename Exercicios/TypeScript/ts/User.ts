///<reference path="UserContact.ts"/>
/**
 * Created by rodrigo on 19/05/16.
 */
class User{
    id: number;
    name: string;
    email: string;
    password: string;
    contacts: Array<UserContact>;

    constructor(id: number, name: string, email: string, password: string){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    addContact(contact: UserContact): void{
        this.contacts.push(contact);
    }
}