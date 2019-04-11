import { Injectable } from '@angular/core';
import { User } from '../model/User';
import { environment } from 'src/environments/environment';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get<User[]>(environment.urlGetUsers);
  }

  insertUser(user: User) {
    user.id = 0; // AutoIncrement
    console.log("User To Insert:", user);
    const body = new HttpParams().set('id', user.id.toString()).set('name', user.name).set('lastname', user.lastname)
      .set('nick', user.nick).set('password', user.password);
    return this.http.post(environment.urlCreateUser, body).subscribe();
  }
}
