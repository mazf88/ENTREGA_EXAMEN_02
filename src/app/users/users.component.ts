import { Component, OnInit, Input } from '@angular/core';
import { User } from '../model/User';
import { UserService } from '../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  myUsers: Array<User>;
  title = 'Usuarios';

  constructor(private userService: UserService, private router: Router) {
    this.myUsers = new Array();
  }

  back() {
    this.router.navigateByUrl('/artists');
  }

  ngOnInit() {
    this.userService.getUsers()
      .subscribe(data => {
        this.myUsers = data;
      })
  }

}
