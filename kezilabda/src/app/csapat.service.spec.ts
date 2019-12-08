import { TestBed } from '@angular/core/testing';

import { CsapatService } from './csapat.service';

describe('CsapatService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CsapatService = TestBed.get(CsapatService);
    expect(service).toBeTruthy();
  });
});
