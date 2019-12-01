import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CsapatokKezeleseComponent } from './csapatok-kezelese.component';

describe('CsapatokKezeleseComponent', () => {
  let component: CsapatokKezeleseComponent;
  let fixture: ComponentFixture<CsapatokKezeleseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CsapatokKezeleseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CsapatokKezeleseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
