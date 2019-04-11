import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArtistsComponent } from './artists/artists.component';
import { LoginComponent } from './login/login.component';
import { CreateArtistComponent } from './create-artist/create-artist.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { UsersComponent } from './users/users.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'artists', component: ArtistsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'createArtist', component: CreateArtistComponent },
  { path: 'createUser', component: CreateUserComponent },
  { path: 'users', component: UsersComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }