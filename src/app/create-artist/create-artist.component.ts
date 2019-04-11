import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Artist } from '../model/Artist';
import { ArtistService } from '../services/artist.service';

@Component({
  selector: 'app-create-artist',
  templateUrl: './create-artist.component.html',
  styleUrls: ['./create-artist.component.css']
})
export class CreateArtistComponent implements OnInit {

  title = 'Artista';
  myArtists: Array<Artist>;
  myArtist: Artist;

  constructor(private router: Router, private artistsService: ArtistService) {
    this.myArtists = new Array();
    this.myArtist = new Artist();
  }

  addNewArtist() {
    this.artistsService.insertArtist(this.myArtist);
    alert("Artist Added!!!");
    this.myArtists.push(this.myArtist);
    this.myArtist = new Artist();
    this.router.navigateByUrl('/artists');
  }

  back() {
    this.router.navigateByUrl('/artists');
  }

  ngOnInit() {
  }

}
