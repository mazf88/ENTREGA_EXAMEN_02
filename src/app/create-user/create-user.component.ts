import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../model/User';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  title = 'Usuario';
  myUsers: Array<User>;
  myUser: User;

  constructor(private router: Router, private userService: UserService) {
    this.myUsers = new Array();
    this.myUser = new User();
  }

  back() {
    this.router.navigateByUrl('/artists');
  }

  addNewUser() {
    this.userService.insertUser(this.myUser);
    alert("User Added!!!");
    this.myUsers.push(this.myUser);
    this.myUser = new User();
    this.router.navigateByUrl('/users');
  }

  ngOnInit() {
  }

}
