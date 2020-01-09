package mvc.controllers.v1;

import mvc.api.v1.model.VendorDTO;
import mvc.api.v1.model.VendorListDTO;
import mvc.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Author:   Okan Hollander
 * Date:     09/01/2020
 * Time:     11:50
 */
@RestController
@RequestMapping(VendorController.BASE_URL)
public class VendorController {

    public static final String BASE_URL = "/api/v1/vendors/";
    public static final String ID = "{id}";
    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public VendorListDTO getAllVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping(VendorController.ID)
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO getVendorById(@PathVariable Long id) {
        return vendorService.getVendorById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VendorDTO createNewVendor(@RequestBody VendorDTO vendorDTO) {
        return vendorService.createNewVendor(vendorDTO);
    }

    @PutMapping(VendorController.ID)
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO saveVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {
        return vendorService.saveVendorByDTO(id, vendorDTO);
    }

    @PatchMapping(VendorController.ID)
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO patchVendor(@PathVariable Long id, VendorDTO vendorDTO) {
        return vendorService.patchVendor(id, vendorDTO);
    }

    @DeleteMapping(VendorController.ID)
    @ResponseStatus(HttpStatus.OK)
    public void deleteVendorById(@PathVariable Long id) {
        vendorService.deleteVendorById(id);
    }
}
