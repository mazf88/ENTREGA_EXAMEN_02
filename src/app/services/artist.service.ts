import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Artist } from '../model/Artist';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ArtistService {

  constructor(private http: HttpClient) { }

  getArtists() {
    return this.http.get<Artist[]>(environment.urlGetArtists);
  }

  insertArtist(artist: Artist) {
    artist.id = 0; // AutoIncrement
    console.log("Artist To Insert:", artist);
    const body = new HttpParams().set('id', artist.id.toString()).set('name', artist.name).set('category', artist.category)
      .set('description', artist.description).set('image', artist.image);
    return this.http.post(environment.urlCreateArtist, body).subscribe();
  }
}
