import { Component, OnInit, Input } from '@angular/core';
import { User } from '../model/User';

@Component({
  selector: 'app-card-user',
  templateUrl: './card-user.component.html',
  styleUrls: ['./card-user.component.css']
})
export class CardUserComponent implements OnInit {

  @Input() selectedUser: User;

  constructor() { }

  ngOnInit() {
  }

}
