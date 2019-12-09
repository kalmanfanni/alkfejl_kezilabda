import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import {MatInputModule} from '@angular/material/input';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSelectModule} from '@angular/material/select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderInterceptor } from './header-interceptor';

import { MatToolbarModule, MatIconModule, MatButtonModule } from '@angular/material';
import { KezdolapComponent } from './kezdolap/kezdolap.component';
import { JatekosokKezeleseComponent } from './jatekosok-kezelese/jatekosok-kezelese.component';
import { CsapatokKezeleseComponent } from './csapatok-kezelese/csapatok-kezelese.component';
import { JegyvasarlasComponent } from './jegyvasarlas/jegyvasarlas.component';
import { RoutingModule } from './routing/routing.module';
import { MeccsekKezeleseComponent } from './meccsek-kezelese/meccsek-kezelese.component';


@NgModule({
  declarations: [
    AppComponent,
    KezdolapComponent,
    JatekosokKezeleseComponent,
    CsapatokKezeleseComponent,
    JegyvasarlasComponent,
    MeccsekKezeleseComponent,
  
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatInputModule,
    RoutingModule,
    MatButtonToggleModule,
    MatSelectModule,
    FormsModule,
  ],
  providers: [
    {provide: HTTP_INTERCEPTORS,
    useClass: HeaderInterceptor,
    multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

