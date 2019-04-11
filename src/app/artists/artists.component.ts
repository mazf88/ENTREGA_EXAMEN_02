import { Component, OnInit } from '@angular/core';
import { ArtistService } from '../services/artist.service';
import { Artist } from '../model/Artist';
import { Router } from '@angular/router';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css']
})
export class ArtistsComponent implements OnInit {

  myArtists: Array<Artist>;
  title = 'Artistas';

  constructor(private artistService: ArtistService, private router: Router) {
    this.myArtists = new Array();
  }

  createArtist() {
    this.router.navigateByUrl('/createArtist');
  }

  createUser() {
    this.router.navigateByUrl('/createUser');
  }

  getUsers() {
    this.router.navigateByUrl('/users');
  }

  ngOnInit() {
    this.artistService.getArtists()
      .subscribe(data => {
        this.myArtists = data;
      })
  }

}
