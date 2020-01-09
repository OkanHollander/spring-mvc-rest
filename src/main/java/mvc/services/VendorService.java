package mvc.services;

import mvc.api.v1.model.VendorDTO;
import mvc.api.v1.model.VendorListDTO;

/**
 * Author:   Okan Hollander
 * Date:     09/01/2020
 * Time:     10:52
 *
 */
public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
