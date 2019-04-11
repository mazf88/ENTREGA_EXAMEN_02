import { Component, OnInit, Input } from '@angular/core';
import { Artist } from '../model/Artist';

@Component({
  selector: 'app-card-artist',
  templateUrl: './card-artist.component.html',
  styleUrls: ['./card-artist.component.css']
})
export class CardArtistComponent implements OnInit {

  @Input() image: string;
  @Input() selectedArtist: Artist;

  constructor() { }

  ngOnInit() {
  }

}
